package Challenges.section5.switchta;
import java.util.Scanner;

public class days {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    System.out.print("Enter a number between 0 - 6 : ");
    int input = user.nextInt();
    printDayOfTheWeek(input);
  }

  public static void printDayOfTheWeek(int day) {
    switch (day) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Thursday");
        break;
      case 3:
        System.out.println("Wednesday");
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Invalid Value");
        break;

    }
  }
}
