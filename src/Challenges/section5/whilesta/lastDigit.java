package Challenges.section5.whilesta;

public class lastDigit {
  public static void main(String[] args) {
    System.out.println(hasSameDigit(12, 22, 13));
    System.out.println(hasSameDigit(41, 22, 71));
    System.out.println(hasSameDigit(23, 32, 42));
    System.out.println(hasSameDigit(9, 99, 999));
  }

  public static boolean hasSameDigit(int y, int x, int e) {
    if (!isValid(e) || !isValid(y) || !isValid(x)) {
      return false;
    }

    int first = y % 10;
    int second = x % 10;
    int third = e % 10;

    return ((first == second) || (first == third) || (second == third));
  }

  public static boolean isValid(int r) {
    return (r >= 10 && r <= 1000);
  }

}
