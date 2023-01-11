package Challenges.Examples;

import javax.swing.*;

public class code1 {
  public static void main(String[] args) {

    checkNumber(-9);
  }

  public static int checkNumber(int num) {
    if (num > 0)
      System.out.println("Positive");
    else if (num == 0) {
      System.out.println("Zero");
    } else {
      System.out.println("Negative");
    }
    return -1;
  }
}
