package Challenges.InheritanceExericises;

public class Car extends Vehicle {
  private int wheels;
  private int doors;
  private int gears;
  private String color;
  private boolean isManual;
  private int currentGrear;

  public Car(String name, String size, int wheels, int doors, int gears, String color, boolean isManual) {
    super(name, size);
    this.wheels = wheels;
    this.doors = doors;
    this.gears = gears;
    this.color = color;
    this.isManual = isManual;
    this.currentGrear = 1;
  }

  public void changeGear(int currentGrear){
    this.currentGrear = currentGrear;
    System.out.println("Car.setCurrentGear(): Change to " + this.currentGrear + " gear.");
  }

  public void changeVelocity(int speed, int direction) {
    System.out.println("Car.changeVelocity() Velocity " + speed + " direction " + direction);
    move(speed, direction);
  }


}


