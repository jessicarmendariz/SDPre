import java.util.Scanner;
public class Objective9Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double num1, num2, sum, avg, tax;
    boolean keepGoing = true;
    int selection;
    double answer = 0.0;

    System.out.println("Please give me a number: ");
    num1 = kb.nextDouble();
    System.out.println("Please give me another number: ");
    num2 = kb.nextDouble();

    while (keepGoing) {
      printMenu();
      System.out.println("Which would you like to do?");
      selection = kb.nextInt();

      switch(selection) {
        case 1:
        sum = findSum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        break;

        case 2:
        avg = findAverage(num1, num2);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);
        break;

        case 3:
        tax = findTax(num1, num2);
        System.out.println("The total amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is " + tax);
        break;

        case 4:
        System.out.println("You've chosen to quit.");
        keepGoing = false;
        break;

        default:
        System.out.println("Invalid Entry");

      }
    }

      kb.close();
    }
    public static void printMenu() {
      System.out.println();
      System.out.println("========= MENU ==========");
      System.out.println("|                       |");
      System.out.println("|   1. Add Numbers      |");
      System.out.println("|   2. Find Average     |");
      System.out.println("|   3. Calculate Tax    |");
      System.out.println("|   4. Exit             |");
      System.out.println("|                       |");
      System.out.println("=========================");
      System.out.println();
    }
    public static double findSum(double num1, double num2) {
      double sum = num1 + num2;
      return sum;
    }

    public static double findAverage(double num1, double num2) {
      double avg = (num1 + num2)/2;
      return avg;
    }

    public static double findTax(double num1, double num2) {
      double tax = (num1 + num2)*0.0831;
      return tax;
    }
  }
