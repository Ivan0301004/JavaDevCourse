package Challenges.section4;

public class sumChecker {
  public static void main(String[] args) {
    System.out.println(hasEqualSum(1,1,1));
  }

  public static boolean hasEqualSum(int num, int numTwo, int total){
    if(num + numTwo == total){
      return true;
    }else {
      return false;
    }
  }
}
