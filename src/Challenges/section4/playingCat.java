package Challenges.section4;

public class playingCat {
  public static void main(String[] args) {
    System.out.println(isCatPlaying(true, 10));
    System.out.println(isCatPlaying(false, 36));
    System.out.println(isCatPlaying(false, 35));
    System.out.println(isCatPlaying(true, 30));
    System.out.println("\n");
    System.out.println(cat(true,10));
    System.out.println(cat(false,36));
    System.out.println(cat(false,35));
    System.out.println(cat(true,30));
  }

  public static boolean isCatPlaying(boolean summer, int temp) {
    if (summer && (temp >= 25 && temp <= 45)) {
      return true;
    } else if (!summer && (temp >= 25 && temp <= 35)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean cat(boolean summer, int temp){
    int playingSummer = !summer ? 35 : 45;
    return (temp >=25 && temp <= playingSummer);
  }
}
