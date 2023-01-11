package Challenges.section5.whilesta;

public class largestPrime {
  public static void main(String[] args) {
    System.out.println(getLargestPrime(21));
  }

  public static int getLargestPrime(int num) {
    if (num < 2) {
      return -1;
    }

    for (int i = 2; i < num / 2; i++) {
      if (num % i == 0) {
        num /= i;
        i--;
      }
    }
    return num;
  }
  
}
