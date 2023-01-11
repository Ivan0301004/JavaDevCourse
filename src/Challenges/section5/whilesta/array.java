package Challenges.section5.whilesta;

public class array {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 3, 3, 3, 4, 4, 5 };
    int user = 3;
    int num = 0;

    for (int element : arr) {
      if (element == user) {
        num++;
      }
    }
    System.out.println("The number " + user + " are repeat " + num + " Times");
  }
}
