package Challenges.section4;

public class minutesToYears {
  public static void main(String[] args) {
    printYearsAndDays(561600);
    printYearsAndDays(1051200);
    printYearsAndDays(525600);
    printYearsAndDays(-1);
  }

  public static void printYearsAndDays(long minutes) {
    if (!(minutes >= 0)) {
      System.out.println("Invalid Value");
      return;
    }
    long year = ((minutes / 60 ) / 24 ) / 365;
    long day = ((minutes / 60) / 24) % 365;
    System.out.println(minutes + " min = " + year + " y and " + day + " d");
  }

}
