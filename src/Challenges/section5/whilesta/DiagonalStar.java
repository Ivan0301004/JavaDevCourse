package Challenges.section5.whilesta;

public class DiagonalStar {
  public static void main(String[] args) {
    pattern_6(5);
    System.out.println();
    pattern_28(5);
  }

  public static void printSquareStar(int n) {

  }

  public static void print(int numero) {
    for (int i = 1; i <= numero; i++) {
      for (int j = 1; j <= numero - i + 1; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }

  public static void figure_2(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void pattern_5(int n) {
    for (int i = 0; i < 2 * n; i++) {
      int stars = i > n ? 2 * n - i : i;
      for (int j = 0; j < stars; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }


  public static void pattern_6(int n) {
    for (int i = 0; i <= n; i++) {
      for (int s = 0; s <= n - i; s++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }

  public static void pattern_28(int n) {
    for (int i = 0; i <= 2 * n; i++) {
      int totalColsInRow = i > n ? 2 * n - i : i;
      int noOfSpaces = n - totalColsInRow;
      for (int s = 0; s < noOfSpaces; s++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= totalColsInRow; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
