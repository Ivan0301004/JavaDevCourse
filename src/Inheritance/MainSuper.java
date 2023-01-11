package Inheritance;

class superClass {
  public void printMethod() {
    System.out.println("Super class was called");
  }
}

class subClass extends superClass {
  public void printMethod() {
    super.printMethod();
    System.out.println("Sub class was called");
  }
}


public class MainSuper {
  public static void main(String[] args) {
    subClass sub = new subClass();
    sub.printMethod();

  }


}
