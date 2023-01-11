package Challenges.section5.whilesta;

public class evenSum {
  public static void main(String[] args) {
    System.out.println(evenDigitSum(123456789));
    System.out.println(evenDigitSum(252));
    System.out.println(evenDigitSum(-22));
  }

  public static int evenDigitSum(int num) {
    if (num < 0) {
      return -1;
    }
    int sum = 0;
    int mod;
    while (num > 0) {
      mod = num % 10;
      if (mod % 2 == 0) {
        sum += mod;
      }
      num /= 10;
    }
    return sum;
  }
}
