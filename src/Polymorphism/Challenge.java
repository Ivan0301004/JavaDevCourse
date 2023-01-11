package Polymorphism;

class Car {
  private boolean engine;
  private int wheels;
  private int cylinders;
  private String name;

  public Car(String name, int cylinders) {
    this.name = name;
    this.engine = true;
    this.cylinders = cylinders;
    this.wheels = 4;
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }

  public String startEngine() {
    return "Car -> Start Engine.";
  }

  public String accelerate() {
    return "Car -> accelerate";
  }

  public String carBrake() {
    return "Car -> Brake";
  }
}

class Skyline extends Car {
  public Skyline(String name, int cylinders) {
    super(name, cylinders);
  }

  @Override
  public String startEngine() {
    return getName() + " -> Start Engine";
  }

  @Override
  public String accelerate() {
    return getName() + " -> Accelerate";
  }

  @Override
  public String carBrake() {
    return getName() + " -> Brake";
  }


}

class Porsche911 extends Car {
  public Porsche911(String name, int cylinders) {
    super(name, cylinders);

  }

  @Override
  public String startEngine() {
    return getName() + " -> Start Engine";
  }

  @Override
  public String accelerate() {
    return getName() + " -> Accelerate";
  }

  @Override
  public String carBrake() {
    return getName() + " -> Car Brake";
  }
}

class SilviaS15 extends Car {
  public SilviaS15(String name, int cylinders) {
    super(name, cylinders);
  }

  @Override
  public String startEngine() {
    return getName() + " -> Start Engine";
  }

  @Override
  public String accelerate() {
    return getName() + " -> Accelerate";
  }

  @Override
  public String carBrake() {
    return getName() + " -> Car Brake";
  }


}


public class Challenge {
  public static void main(String[] args) {
    Car car = new Car("New Car", 6);
    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.carBrake());

    Skyline GTR34 = new Skyline("Skyline GTR - R34", 6);
    System.out.println(GTR34.startEngine());
    System.out.println(GTR34.accelerate());
    System.out.println(GTR34.carBrake());

    Porsche911 porsche = new Porsche911("Porsche Carrera 911", 6);
    System.out.println(porsche.startEngine());
    System.out.println(porsche.accelerate());
    System.out.println(porsche.carBrake());

    SilviaS15 silvia = new SilviaS15("Silvia S15 1998", 6);
    System.out.println(silvia.startEngine());
    System.out.println(silvia.accelerate());
    System.out.println(silvia.carBrake());


  }
}





















