package Inheritance;

public class Dog extends Animal {
  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;

  public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(name, 1, 1, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }

  @Override
  public void eat() {
    System.out.println("Eat from dog was called");
    super.eat();
  }

  public void walk() {
    System.out.println("Dog.Walk() was called");
    move(6);
  }

  public void run() {
    System.out.println("Dog.Run() was called.");
    move(20);
  }

  public void moveLegs(int speed){
    System.out.println("Dog.MoveLegs() called");
  }

  @Override
  public void move(int speed) {
    System.out.println("Dog.move() called");
    moveLegs(speed);
    super.move(speed);
  }
}
