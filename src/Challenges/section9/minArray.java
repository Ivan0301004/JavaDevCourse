package Challenges.section9;

import java.util.Scanner;

public class minArray {
  private static Scanner user = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter the amount of your array : ");
    int amount = readAmount();
    int[] array = readIntegers(amount);
    System.out.println("The min num in the array is : " + findMin(array));
  }


  private static int readAmount(){
    Scanner user = new Scanner(System.in);
    return user.nextInt();
  }

  private static int[] readIntegers(int len) {
    int[] arr = new int[len];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = user.nextInt();
    }
    return arr;
  }

  private static int findMin(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}
