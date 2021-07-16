import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

System.out.println("What is your first name?");
fname = input.nextLine();
System.out.println("What is your last name?");
lname = input.nextLine();
System.out.println("What is your favorite animal?");
favoriteAnimal = input.nextLine();
System.out.println("What is your favorite food?");
favoriteFood = input.nextLine();
System.out.println("What is your favorite Song?");
favoriteSong = input.nextLine();
System.out.println("My name is " + fname + " " + lname +".");
System.out.println("My Favorite animal is " + favoriteAnimal + ".");
System.out.println("My favorite food is " + favoriteFood + ".");
System.out.println("My Favorote song is " + favoriteSong + ".");


  }
}
