package Challenges.section5.userInput;

import java.util.Scanner;

public class MinMAx {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    int min = 0;
    int max = 0;
    boolean first = true;

    while (true) {
      System.out.print("Enter number: ");
      boolean isAnInt = user.hasNextInt();

      if (isAnInt) {
        int number = user.nextInt();
        if (first) {
          first = false;
          min = number;
          max = number;
        }
        if (number > max) {
          max = number;
        }
        if (number < min) {
          min = number;
        }
      } else {
        break;
      }
      user.nextLine(); // handel input
    }
    System.out.println("Min = " + min + " Max = " + max);
    user.close();
  }
}
