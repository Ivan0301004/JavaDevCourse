package ArraysNList;

import java.util.Arrays;
import java.util.Scanner;


public class Arrayss {
  public static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    /*int num = 0;
    System.out.print("Enter the length of your array : ");
    num = in.nextInt();*/
    int[] user = getIntegers(5);
    int[] sort = sortIntegers(user);
    printArray(sort);
  }

  public static int[] getIntegers(int len) {
    int[] arr = new int[len];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }
    return arr;
  }

  public static void printArray(int[] arr) {
    System.out.print("You array is : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Element" + i + " contents " + arr[i]);
    }
  }

  public static void prom(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    System.out.println("The avg is : " + (double) sum / arr.length);
  }

  public static int[] sortIntegers(int[] arr) {
    int[] sortedArray = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      sortedArray[i] = arr[i];
    }
    boolean flag = true;
    int temp;

    while (flag) {
      flag = false;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }
      }
    }
    return sortedArray;
  }
}
