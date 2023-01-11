package ClassesConstructorsInheritance.Constructors;

public class BankAccount {
  private String number;
  private double balance;
  private String name;
  private String email;
  private String phoneNumber;

  public BankAccount() {
    this("0101", 1.0, "Default", "Default", "Default");
  }

  public BankAccount(String number, double balance, String name, String email, String phoneNumber) {
    this.number = number;
    this.balance = balance;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public BankAccount(String name, String email, String phoneNumber) {
    this("123", 100.00, name, email, phoneNumber);
  }

  public void deposit(double amount) {
    this.balance += amount;
    System.out.println("Deposit of " + this.balance + " made. New balance is " + this.balance);
  }

  public void withDrawl(double amount) {
    if (this.balance - amount < 0) {
      System.out.println("Only " + amount + " processed. Remaining balance." + this.balance);
    } else {
      balance -= amount;
      System.out.println("Withdrawal of " + amount + " processed. Remaining balance : " + this.balance);
    }
  }


  public String getNumber() {
    return this.number;
  }

  public void setNumber(String num) {
    this.number = num;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String mail) {
    this.email = mail;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
