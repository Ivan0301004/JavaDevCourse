package Challenges.BillsBurguers;

public class HealthyBurger extends Hamburger {
  private String healthyItemOneName;
  private double healthyItemOnePrice;

  private String healthyItemTwoName;
  private double healthyItemTwoPrice;

  public HealthyBurger(String meat, double price) {
    super("Healthy", meat, price, "Brown Rye");
  }

  public void addHealthyAdd1(String meat, double price) {
    this.healthyItemOneName = meat;
    this.healthyItemOnePrice = price;
  }

  public void addHealthyAdd2(String meat, double price) {
    this.healthyItemTwoName = meat;
    this.healthyItemTwoPrice = price;
  }

  @Override
  public double itemizeHamburger() {
    double price = super.itemizeHamburger();
    if (this.healthyItemOneName != null) {
      price += this.healthyItemOnePrice;
      System.out.println("Added " + this.healthyItemOneName + " for an extra " + this.healthyItemOnePrice);
    }
    if (this.healthyItemTwoName != null) {
      price += this.healthyItemTwoPrice;
      System.out.println("Added " + this.healthyItemTwoName + " for an extra " + this.healthyItemTwoPrice);
    }
    return price;
  }
}
