package Challenges.section5.userInput;

import java.util.Scanner;

public class inputCalculator {
  public static void main(String[] args) {
    inputThenPrintSumAndAverage();
  }

  public static void inputThenPrintSumAndAverage() {
    Scanner user = new Scanner(System.in);
    int sum = 0, number;
    double avg = 0;
    int count = 0;
    System.out.print("Enter numbers : ");

    while (true) {
      boolean isAnInt = user.hasNextInt();
      if (isAnInt) {
        number = user.nextInt();
        count++;
        sum += number;
        avg = (double)sum / count;
      } else {
        System.out.println("SUM = " + sum + " AVG = " + ((double) Math.round(avg)));
        break;
      }
      user.nextLine();
    }
    user.close();
  }
}
