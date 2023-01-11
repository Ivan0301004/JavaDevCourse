package Challenges.section5.whilesta;

public class evenNumber {
  public static void main(String[] args) {
    System.out.println("The number 8 is even ? : " + isEven(8));
    System.out.println("\n\n");

    int ini = 4;
    int end = 20;
    int evenFound = 0;
    while (ini <= end) {
      ini++;
      if (!isEven(ini)) {
        continue;
      }
      evenFound++;
      if (evenFound >= 5) break;

      System.out.println("Even number : " + ini);
    }
      System.out.println("Even numers found : " + evenFound);

  }

  public static boolean isEven(int n) {
    return n % 2 == 0;
  }

}
