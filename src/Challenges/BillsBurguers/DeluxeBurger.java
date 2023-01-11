package Challenges.BillsBurguers;

public class DeluxeBurger extends Hamburger {
  private String itemOneName;
  private double itemOnePrice;
  private String itemTwoName;
  private double itemTwoPrice;

  public DeluxeBurger() {
    super("Deluxe", "Kobe", 20, "White");
    super.addItem1("Chips", 5);
    super.addItem2("Bear", 15);
  }

  @Override
  public void addItem1(String addition1Name, double addition1Price) {
    System.out.println("Cannot not added additional items to Deluxe Burger");
  }

  @Override
  public void addItem2(String addition2Name, double addition2Price) {
    System.out.println("Cannot not added additional items to Deluxe Burger");
  }

  @Override
  public void addItem3(String addition3Name, double addition3Price) {
    System.out.println("Cannot not added additional items to Deluxe Burger");
  }

  @Override
  public void addItem4(String addition4Name, double addition4Price) {
    System.out.println("Cannot not added additional items to Deluxe Burger");
  }
}
