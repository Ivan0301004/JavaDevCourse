package Challenges.section5.whilesta;

public class commonDivisor {
  public static void main(String[] args) {
    System.out.println("Common divisor  : " + getGreatesCommunDivisor(25, 15));
  }

  public static int getGreatesCommunDivisor(int x, int y) {
    if (x < 9 || y < 9) {
      return -1;
    }

    while (x != y) {
      if (x > y) {
        x = x - y;
      } else {
        y = y - x;
      }
    }
    return x;
  }

}
