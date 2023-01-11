package Challenges.section5.forsta;

public class one {
  public static void main(String[] args) {
    for (int i = 8; i >= 2; i--) {
      System.out.println("10,000 interest of " + i + "% is " +
          String.format("%.2f", calculateInterest(10000.0, i)));
    }
    System.out.println("====================================\n");
    int i, j, chk, count = 0;

    System.out.println("First 10 Prime Numbers are:");
    for (i = 2; count < 27; i++) {
      chk = 0;
      for (j = 2; j < i; j++) {
        if (!isPrime(i)) {
          chk++;
          break;
        }
      }
      if (chk == 0) {
        System.out.print(" " + i);
        count++;
      }
    }

  }

  public static double calculateInterest(double amount, double interestPercent) {
    return (amount * (interestPercent / 100));
  }

  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i = 2; i <= (long) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
