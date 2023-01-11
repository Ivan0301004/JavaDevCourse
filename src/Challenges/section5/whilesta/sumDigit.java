package Challenges.section5.whilesta;

public class sumDigit {
  public static void main(String[] args) {
    System.out.println("Sum : " + sumDigits(125));
  }

  private static int sumDigits(int ends) {
    if (ends <= 10) {
      return -1;
    }

    int sum = 0;
    int mod;
    while (ends > 0) {
      mod = ends % 10;
      sum += mod;
      ends /= 10;
    }
    return sum;
  }
}
