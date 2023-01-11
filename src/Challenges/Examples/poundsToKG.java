package Challenges.Examples;

import java.util.Arrays;

public class poundsToKG {
  public static void main(String[] args) {
    double kg = 12d;
    double pounds = kg / 0.453;
    System.out.println(kg + "kg equivalent to " + pounds + " Pounds");
    System.out.printf("%.2fKg equivalent to %.2f Pounds\n", kg, pounds);
    System.out.println("args = " + Arrays.deepToString(args));
  }
}
