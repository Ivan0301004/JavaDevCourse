package Challenges.section4;


public class decimal {
  public static void main(String[] args) {
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
  }

  public static boolean areEqualByThreeDecimalPlaces(double one, double two){
   return (int)(one * 100) == (int)(two * 100);
  }
}
