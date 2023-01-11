package Challenges.section5.forsta;

public class sum1_1000 {
  public static void main(String[] args) {
    int sum = 0;
    int count = 0;
    for (int i = 3; i <= 1000; i+=3) {
      if (/*i % 3 == 0 */ i % 5 == 0) {
        sum += i;
        count++;
      }
      if (count == 5) {
        break;
      }
    }
    System.out.println("The sum is : " + sum);
  }
}
