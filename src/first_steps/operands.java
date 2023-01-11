package first_steps;

public class operands {
  public static void main(String[] args) {
    double in = 78d / 8d;
    int y = 9 * 7;
    byte op = 3 * 7;

    System.out.println((in * 9) % 2);
    System.out.println(y);
    System.out.println(op);

    op += 23;
    System.out.println("new op : " + op);
    y -=10;
    System.out.println("new y  : " + y);
    in  *= 3d;
    System.out.println("new in :" + in);
  }
}
