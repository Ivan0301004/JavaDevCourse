package Challenges.section9;

import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {

    int[] array = {1, 34, 54, 2, 32, 5345, 12};

    System.out.println("Array : " + Arrays.toString(array));

//    System.out.println();reverse(array);
    System.out.println("Array reverse : " + Arrays.toString(reverse(array)));

  }

  private static int[] reverse(int[] arr) {
    int maxIndex = arr.length - 1;
    int halfArray = arr.length / 2;
    for (int i = 0; i < halfArray; i++) {
      int temp = arr[i];
      arr[i] = arr[maxIndex - i];
      arr[maxIndex - i] = temp;
    }
    return arr;
  }

}
