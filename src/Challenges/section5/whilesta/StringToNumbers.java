package Challenges.section5.whilesta;

public class StringToNumbers {
  public static void main(String[] args) {
    String number = "2019";
    System.out.println("Number as String = " + number);

    int newNumber = Integer.parseInt(number);
    System.out.println("Number Int = " + newNumber);

    number += 1;
    newNumber += 1;
    System.out.println("Number as String  = " + number);
    System.out.println("Number Int = " + newNumber);

  }
}
