package ClassesConstructorsInheritance.Constructors;

public class MainBank {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("123", 50.0, "12", "Ivan@gmail.com", "1232112");


    BankAccount zuri = new BankAccount("123", 100.55, "Zuury", "@gmail.com", "123");
    System.out.println("Zuri name : " + zuri.getName());
    zuri.deposit(100.55);
    zuri.withDrawl(21.1);

  }
}
