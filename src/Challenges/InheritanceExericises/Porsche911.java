package Challenges.InheritanceExericises;

public class Porsche911 extends Car {
  private int roadServices;

  public Porsche911(int roadServices) {
    super("Porsche911", "10", 4, 4, 5, "Black", true);
    this.roadServices = roadServices;
  }

  public void accelerate(int rate) {
    int newVelocity = getCurrentVelocity() + rate;

    if (newVelocity == 0) {
      stop();
      changeGear(1);
    } else if (newVelocity > 0 && newVelocity <= 80) {
      changeGear(1);
    } else if (newVelocity > 80 && newVelocity <= 150) {
      changeGear(2);
    } else if (newVelocity > 150 && newVelocity <= 210) {
      changeGear(3);
    } else if (newVelocity > 210 && newVelocity <= 290) {
      changeGear(4);
    } else {
      changeGear(5);
    }

    if (newVelocity > 0) {
      changeVelocity(newVelocity, getCurrentDirection());
    }
  }

}
