package Challenges.section4;

public class teenChecker {
  public static void main(String[] args) {
    System.out.println(hasTeen(9, 99, 19));
    System.out.println(hasTeen(23, 15, 42));
    System.out.println(hasTeen(22, 23, 34));
  }

  public static boolean hasTeen(int y, int x, int e) {
    return isTeen(y) || isTeen(x) || isTeen(e);
  }

  public static boolean isTeen(int x) {
    return (x >= 13) && (x <= 19);
  }
}
