package Challenges.BillsBurguers;

public class Main {
  public static void main(String[] args) {
    Hamburger uno = new Hamburger("Whooper", "Kobe", 10, "White");
    uno.addItem1("Chips", 1);
    uno.addItem2("Chips", 1.2);
    uno.addItem3("Mayonnaise", 0.9);
    double price = uno.itemizeHamburger();
    System.out.println("The new price is " + price + " dollars.");
    System.out.println();

    HealthyBurger healthy = new HealthyBurger("Chicken", 5.8);
    healthy.addItem1("Lettuce", 2.7);
    System.out.println("The final price is : " + healthy.itemizeHamburger());

    System.out.println();
    DeluxeBurger db = new DeluxeBurger();
    db.addItem1("Cheese",12);
    db.itemizeHamburger();
  }
}
