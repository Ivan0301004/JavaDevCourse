package Challenges.Composition.theHouse;

public class Bed {
  private String size;
  private int price;
  private String material;
  private Mattress mattress;

  public Bed(String size, int price, String material, Mattress mattress) {
    this.size = size;
    this.price = price;
    this.material = material;
    this.mattress = mattress;
  }


  public void sleep(int hour) {
    System.out.println("Sleep in " + hour + " hour at night.");
  }


  public String getSize() {
    return size;
  }

  public int getPrice() {
    return price;
  }

  public String getMaterial() {
    return material;
  }

  public Mattress getMattress() {
    return mattress;
  }
}
