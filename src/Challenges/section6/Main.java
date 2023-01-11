package Challenges.section6;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    simpleCalculator test = new simpleCalculator();
    Scanner user = new Scanner(System.in);
    System.out.print("Enter two numbers : ");
    double one = user.nextDouble();
    double two = user.nextDouble();

    test.setFirstNumber(one);
    test.setSecondNumber(two);
    System.out.print("First number is   : " + test.getFirstNumber() + "\nSecond number is  : " + test.getSecondNumber() + " \n\n");
    System.out.println("Addition       : " + test.getAdditionResult());
    System.out.println("Subtraction    : " + test.getSubtractionResult());
    System.out.println("Multiplication : " + test.getMultiplicationResult());
    System.out.println("Division       : " + String.format("%.2f" ,test.getDivisionResult()));

  }

}
