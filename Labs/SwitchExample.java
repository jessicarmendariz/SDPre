public class SwitchExample {
  public static void main(String[] args) {
    char grade;
    grade = 'B';

    switch (grade) {
    case 'A':
      System.out.println("Fantastic job!");
      break;
    case 'B':
      System.out.println("Good job!");
      break;
    case 'C':
      System.out.println("You're doing okay.");
      break;
    case 'D':
      System.out.println("Start finishing homework and showing up for class.");
      break;
    default:
      System.out.println("Invalid grade.");
    }
  }
}
