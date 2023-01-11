package Challenges.section5.forsta;

public class odd {
  public static void main(String[] args) {
    System.out.println("The sum 1 is : " + sumOdd(1, 100));
    System.out.println("The sum 2 is : " + sumOdd(-1, 100));
    System.out.println("The sum 3 is : " + sumOdd(100, 100));
    System.out.println("The sum 4 is : " + sumOdd(13, 13));
    System.out.println("The sum 5 is : " + sumOdd(100, -100));
    System.out.println("The sum 6 is : " + sumOdd(100, 1000));
    System.out.println("The sum 7 is : " + sumOdd(10, 5));
  }

  public static boolean isOdd(int n) {
    if (n <= 0) {
      return false;
    }
    return n % 2 != 0;
  }

  public static int sumOdd(int ini, int end) {
    if (ini < 0 || end < 0 || ini > end)  return -1;
    int sum = 0;
    for (int i = ini; i <= end; i++) {
      if (isOdd(i)) {
        sum += i;
      }
    }
    return sum;
  }
}
