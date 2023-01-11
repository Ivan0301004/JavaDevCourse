package Challenges.section5.whilesta;

public class numerosAPalabras {
  public static void main(String[] args) {
    System.out.println(getDigitCount(10));
    // System.out.println(reverse(-3344));
    numberToWords(123);
    System.out.println("+++++++++++++++++++");
    numberToWords(2004);
    System.out.println();
    numberToWords(10);
    numberToWords(11);

  }

  public static void numberToWords(int numero) {
    if (numero < 0) {
      System.out.println("Invalid Value");
    }

    int reverseNumber = reverse(numero);

    for (int i = 0; i < getDigitCount(numero); i++) {
      switch (reverseNumber % 10) {
        case 0:
          System.out.println("Zero");
          break;
        case 1:
          System.out.println("One");
          break;
        case 2:
          System.out.println("Two");
          break;
        case 3:
          System.out.println("Three");
          break;
        case 4:
          System.out.println("Four");
          break;
        case 5:
          System.out.println("Five");
          break;
        case 6:
          System.out.println("Six");
          break;
        case 7:
          System.out.println("Seven");
          break;
        case 8:
          System.out.println("Eight");
          break;
        case 9:
          System.out.println("Nine");
          break;
        default:
          break;
      }
      reverseNumber /= 10;
    }
    System.out.println();
  }

  public static int reverse(int num) {

    int reverse = 0;
    int store = num;
    while (store != 0) {
      reverse = (reverse * 10) + (store % 10);
      store /= 10;
    }
    return reverse;
  }

  public static int getDigitCount(int num) {
    if (num < 0)
      return -1;

    int count = 1;
    int store = num;
    while (store > 9) {
      store /= 10;
      count++;
    }
    return count;
  }
}
