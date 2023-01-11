package first_steps;

public class logical_operators {
  public static void main(String[] args) {
    //logical and operator
    int price = 345;
    if (price >= 120 && price <= 300) {
      System.out.println("The product is pretty expensive");
    } else {
      System.out.println("I'll not buy it");
    }
    System.out.println();
    // Logical or operator
    boolean simon = false;
    if (!simon) {
      System.out.println("Es correcto mi estimado");
    } else {
      System.out.println("Estas mal mi estimado");
    }


  }
}
