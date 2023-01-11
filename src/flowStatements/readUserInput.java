package flowStatements;

import java.util.Scanner;

public class readUserInput {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    System.out.print("Enter your birth year : ");
    boolean hasInt = user.hasNextInt();

    if (hasInt) {
      int yearOfBirth = user.nextInt();
      user.nextLine();

      System.out.print("Enter your name :");
      String name = user.nextLine();

      int age = 2022 - yearOfBirth;
      if (age >= 0 && age <= 100) {
        System.out.println("Your name is : " + name + " and you are " + age + " years Old.");
      } else {
        System.out.println("Invalid year of Birth.");
      }

    } else {
      System.out.println("Unable to parse year of birth.");
    }
    user.close();
  }
}
