package first_steps;

public class ternary_operator {
  public static void main(String[] args) {
    int num = 78;
    boolean south = num >= 78 ? true : false; // ternary operator

    if (south) {
      System.out.println("yeah its greater");
    } else {
      System.out.println("you failed");
    }
  }
}
