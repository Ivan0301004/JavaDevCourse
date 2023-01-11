package ArraysNList;

import java.util.ArrayList;

class Entero {
  private int numero;

  public Entero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

}

public class AutoBoxing {
  public static void main(String[] args) {

    /*ArrayList<Integer> arr = new ArrayList<Integer>();

    for (int i = 0; i <= 10; i++) {
      arr.add(i + 2);
    }

    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " --> " + arr.get(i));
    }
    */

    ArrayList<Double> nuevo = new ArrayList<Double>();

    for (double i = 0.0; i <= 5.0; i += 0.5) {
      nuevo.add(i);
    }

    for (int j = 0; j < nuevo.size(); j++) {
      double yes = nuevo.get(j);
      System.out.println((j + 1) + " My --> " + yes);
    }
  }
}
