package Composition;

public class Car extends Vehicle {
  private int door;
  private int engineCap;

  public Car(String name, int door, int engineCap) {
    super(name);
    this.door = door;
    this.engineCap = engineCap;
  }
}
