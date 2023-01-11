package first_steps;

public class operatorRecap {
  public static void main(String[] args) {
    double num = 20.00;
    double two = 80.00;

    double sum = num + two * 100.00;
    double remainder = sum % 40.00;

    boolean right = remainder == 0 ? true : false;
    System.out.println("Boolean value : " + right);
    if (!right)
      System.out.println("Got some reminder");

    System.out.println("reminder " + remainder);
  }}