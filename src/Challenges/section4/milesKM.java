package Challenges.section4;

public class milesKM {

  public static long milesPerHour(double km) {
    if (km < 0) {
      return -1;
    }
    return Math.round(km / 1.609);
  }

  public static void print(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      System.out.println("Invalid input");
    } else {
      long miles = milesPerHour(kilometersPerHour);
      System.out.println(kilometersPerHour + "Km == " + miles + " Miles");
    }
  }

}
