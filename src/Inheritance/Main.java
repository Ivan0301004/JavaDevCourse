package Inheritance;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("Tiger", 1, 1, 30, 300);
    Dog dog = new Dog("Pitbull", 30, 30, 2, 4, 1, 23, "Without");

    dog.eat();
    dog.walk();
    dog.run();
  }
}








