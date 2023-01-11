package Challenges.section5.whilesta;

public class Palindrome {
  public static void main(String[] args) {
    System.out.println("1221 is palindrome ? : " + isPalindrome(1221));
    System.out.println("1221 is palindrome ? : " + isPalindrome(-1221));

  }

  public static boolean isPalindrome(int num) {
    if (num < 0) {
      num *= -1;
    }

    int lastDigit;
    int reverse = 0;
    int stored = num;
    while (stored > 0) {
      lastDigit = stored % 10;
      reverse = (reverse * 10) + lastDigit;
      stored /= 10;
    }
    return (reverse == num);
  }

}
