package Challenges.section4;

public class equalityPrinter {
  public static void main(String[] args) {
    printEqual(0, 0, 0);
    printEqual(1, 2, 3);
    printEqual(1, 2, 2);
    printEqual(-1, -2, -2);
    printEqual(-1, 1, 1);


  }
  public static void printEqual(int x, int f, int e) {
    if ((x < 0) || (f < 0) || (e < 0)) {
      System.out.println("Invalid Value");
      return;
    } else if ((x == f) && (f == e)) {
      System.out.println("All numbers are equal");
    } else if ((x != f) && (f != e) && (x != e)) {
      System.out.println("All numbers are different");
    } else {
      System.out.println("Neither all are equal or different");
    }
  }
}
