package Challenges.section5.whilesta;

public class sharedDigits {
  public static void main(String[] args) {
    System.out.println(hasSharedDigits(12, 22));
    System.out.println(hasSharedDigits(9, 99));
  }

  public static boolean hasSharedDigits(int x, int y) {
    if ((x <= 10 || x > 99) || (y <= 10 || y > 99)) {
      return false;
    }

    return ((x / 10 == y / 10) || (x / 10 == y % 10) || (y / 10 == x % 10) || (x % 10 == y % 10));

  }

}
