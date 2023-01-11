package Challenges.section5.whilesta;

public class numeroPerfecto {
  public static void main(String[] args) {
    System.out.println(perfectNumber(6));
    System.out.println(perfectNumber(28));
    System.out.println(perfectNumber(5));
    System.out.println(perfectNumber(-1));
  }

  public static boolean perfectNumber(int y) {
    if (y < 1) {
      return false;
    }
    int i = 1;
    int sum = 0;
    while (i != y) {
      if (y % i == 0) {
        sum += i;
      }
      i++;
    }
    return sum == y;
  }
}
