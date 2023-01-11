package ClassesConstructorsInheritance;

public class MainOOP {
  public static void main(String[] args) {
    Car skyline = new Car();
    skyline.setModel("R34");
    System.out.println("The model of your Skyline is : " + skyline.getModel());
    skyline.setModel("R32");
    System.out.println("The model of your Skyline is : " + skyline.getModel());

  }
}
