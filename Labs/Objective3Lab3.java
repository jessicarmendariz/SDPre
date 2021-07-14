public class Objective3Lab3 {
  public static void main(String[] args) {
    int first = 1 + (int)(Math.random() * 6);
    int second = 1 + (int)(Math.random() * 6);
    int third = 1 + (int)(Math.random() * 6);
    int sum = first + second + third;
    System.out.print(first);
    System.out.print(" + ");
    System.out.print(second);
    System.out.print(" + ");
    System.out.print(third);
    System.out.print(" = ");
    System.out.println(sum);
  }
}
