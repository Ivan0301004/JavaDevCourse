package Challenges.Composition.theHouse;

public class Mattress {
  private String color;
  private String size;
  private String manufacture;


  public Mattress(String color, String size, String manufacture) {
    this.color = color;
    this.size = size;
    this.manufacture = manufacture;
  }

  public String getColor() {
    return color;
  }

  public String getSize() {
    return size;
  }

  public String getManufacture() {
    return manufacture;
  }
}
