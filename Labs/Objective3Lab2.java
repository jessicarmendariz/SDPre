public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1 = 10.0;
    double side2 = 8.0;
    double a = side1 * side1;
    double b = side2 * side2;
    double side3 = a + b;
    double result = Math.sqrt(side3);
    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + result);
  }
}
