package StaticInstance;


class Dog {
  private  String name;

  public Dog(String name){
      this.name = name;
  }
  public void printName(){
    System.out.println("Name : " + name);
  }

}


public class Example {

  public static void main(String[] args) {
    Dog rex =  new Dog("Rex");
    Dog Milo =  new Dog("Milo");

    rex.printName();
    Milo.printName();
  }
}
