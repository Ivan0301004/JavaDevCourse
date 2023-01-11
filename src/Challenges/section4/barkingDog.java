package Challenges.section4;

public class barkingDog {
  public static void main(String[] args) {
    System.out.println(shouldWakeUp(false, 7));
  }

  public static boolean shouldWakeUp(boolean barking, int hour){
    if(hour < 0 || hour  > 23) {
      barking =  false;
    } else if ((hour < 8 || hour > 22) && barking != false) {
      barking = true;
    }else {
      barking = false;
    }
    return barking;
  }
}
