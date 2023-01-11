package Challenges.Examples;

import java.util.Scanner;

public class code2 {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    System.out.print("Enter an amount of Kilometers : ");
    double num = user.nextDouble();
    System.out.println(num + " Km/h is == to " + milesPerHour(num) + " Mile");
  }

  public static long milesPerHour(double km) {
    if (km < 0) {
      return -1;
    }
    return Math.round(km / 1.609);

  }
}
