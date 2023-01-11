package Challenges.section4;

public class areas {
  public static void main(String[] args) {
    System.out.printf("Area Triangle : %.3f\n", area(10));
    System.out.println("Area Rectangle : " + area(10,2));
  }

  public static double area(double radius) {
    if(!(radius >= 0)){
      return -1;
    }
    return Math.PI * Math.pow(radius, 2);
  }
  public static double area(double sideOne, double sideTwo) {
    if(!(sideOne >= 0 && sideTwo >= 0)){
      return -1;
    }
    return sideOne * sideTwo;
  }
}
