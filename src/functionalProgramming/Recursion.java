package functionalProgramming;

public class Recursion {

    static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 1;
        } else return n * factorial(n - 1);
    }

    static int sumArray(int[] arr, int n) {
        return n == 0
            ? 0
            : sumArray(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 8, 9, 3, 2, 8, 5, 1, 7, 2, 8, 7, 3};
        int size = nums.length + 1;
        System.out.println(sumArray(nums, size - 12));

        System.out.println("\nThe factorial of 5 is : " + factorial(5));
    }
}
