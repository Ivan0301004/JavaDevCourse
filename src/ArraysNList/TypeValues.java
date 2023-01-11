package ArraysNList;

import java.util.Arrays;

public class TypeValues {
  public static void main(String[] args) {
    int value = 10;
    int newValue = value;

    System.out.println("Value     : " + value);
    System.out.println("newValue  : " + newValue);

    value++;
    System.out.println("Value     : " + value);
    System.out.println("newValue  : " + newValue);

    int[] array = new int[5];
    int[] newArray = array;

    System.out.println("Array    : " + Arrays.toString(array));
    System.out.println("newArray : " + Arrays.toString(newArray));


    newArray = new int[]{1, 2, 2, 3, 43};
    array[1] = 12;
    System.out.println("Array    : " + Arrays.toString(array));
    System.out.println("newArray : " + Arrays.toString(newArray));

    modifyArray(array);
    System.out.println("Array    : " + Arrays.toString(array));
    System.out.println("newArray : " + Arrays.toString(newArray));

  }

  private static void modifyArray(int[] arr) {
    arr[0] = 23;
    arr = new int[]{1, 2, 3, 43,};
  }
}
