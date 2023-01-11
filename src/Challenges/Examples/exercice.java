package Challenges.Examples;

import java.util.Scanner;

public class exercice {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    int num = user.nextInt();
    if (num > 0)
      System.out.println("Positive");
    else if (num == 0) {
      System.out.println("Neutro");
    } else {
      System.out.println("Negative");
    }
  }
}
