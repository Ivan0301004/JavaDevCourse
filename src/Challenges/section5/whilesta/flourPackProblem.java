package Challenges.section5.whilesta;

public class flourPackProblem {
  public static void main(String[] args) {
    System.out.println(canPack(1, 0, 4));
    System.out.println(canPack(1, 0, 5));
    System.out.println(canPack(0, 5, 4));
    System.out.println(canPack(2, 2, 11));
    System.out.println(canPack(-2, 2, 12));

  }

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if (bigCount < 0 || smallCount < 0 || goal < 0) {
      return false;
    }

    int bigCountToUse = Math.min(bigCount, goal / 5);
    return (goal - bigCountToUse * 5) <= smallCount;
  }

}