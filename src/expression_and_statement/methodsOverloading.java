package expression_and_statement;

public class methodsOverloading {

  public static void main(String[] args) {
    feetAndInchesToCM(7, 5);
    feetAndInchesToCM(100);
    feetAndInchesToCM(8, 4);
  }

  public static double feetAndInchesToCM(double feet, double inches) {
    if (!((feet >= 0) && (inches >= 0 && inches <= 12))) {
      System.out.println("Invalid input");
      return 1;
    }
    double centimeters = (feet * 30.48) + (inches * 2.54);
    System.out.printf("%.3f feet , %.3f inches = %.3f centimeters\n", feet, inches, centimeters);

    return centimeters;
  }

  public static double feetAndInchesToCM(double inches) {
    if (!(inches >= 0)) {
      return -1;
    }
    double feet = (int) inches / 12;
    double rmInches = (int) inches % 12;
    System.out.printf("%.2fin = %.2fft & %.2fin\n", inches, feet, rmInches);

    return feetAndInchesToCM(feet, inches);
  }
}
