package Challenges.section5.switchta;

public class numbersOfDays {

  public static void main(String[] args) {
    System.out.println(getDaysInMonth(1, 2020));
    System.out.println(getDaysInMonth(2, 2020));
    System.out.println(getDaysInMonth(2, 2018));
    System.out.println(getDaysInMonth(-1, 2020));
    System.out.println(getDaysInMonth(1, -2020));
  }

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      return false;
    } else if (year % 400 == 0) {
      return true;
    } else return year % 4 == 0 && year % 100 != 0;
  }

  public static int getDaysInMonth(int month, int year) {
    if ((month > 0 && month < 13) && (year > 0 && year < 10000)) {
      switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          return 31;
        case 2:
          return isLeapYear(year) ? 29 : 28;
        case 4:
        case 6:
        case 9:
        case 11:
          return 30;

      }
    }
    return -1;
  }
}
