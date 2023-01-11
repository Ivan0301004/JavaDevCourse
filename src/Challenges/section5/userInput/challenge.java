package Challenges.section5.userInput;

import java.util.Scanner;


public class challenge {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    int sum = 0;
    int i = 0;

    while (true) {
      int order = i + 1;
      System.out.print("Enter number# " + order + " : ");
      boolean isAnInt = user.hasNextInt();

      if (isAnInt) {
        int number = user.nextInt();
        i++;
        sum += number;
        if (i == 10) {
          break;
        }
      } else {
        System.out.println("Invalid Number");
      }
      user.nextLine();
    }

    System.out.println("The sum is : " + sum);
    user.close();
  }
}
