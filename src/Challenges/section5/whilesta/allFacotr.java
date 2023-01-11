package Challenges.section5.whilesta;


public class allFacotr {
  public static void main(String[] args) {
    printFactor(32);
    printFactor(6);
    printFactor(10);
    printFactor(-10);
  }

  public static void printFactor(int y) {
    if (y < 1) {
      System.out.println("Invalid Value");
    }

    for (int i = 1; i <= y; i++) {
      if (y % i == 0) {
        System.out.print(i + " ");
      } else {
        continue;
      }
    }
    System.out.println();
  }
}
