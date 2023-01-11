package ClassesConstructorsInheritance.Constructors;

public class VipCustomer {
  private String name;
  private double creditLimit;
  private String emailAddress;

  public VipCustomer() {
    this("Default", 100.00, "Default");
  }

  public VipCustomer(String name, double creditLimit) {
    this(name, creditLimit, "user@gmail.com");
  }

  public VipCustomer(String name, double creditLimit, String emailAddress) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCreditLimit() {
    return this.creditLimit;
  }

  public void setCreditLimit(double creditLimit) {
    this.creditLimit = creditLimit;
  }

  public String getEmailAddress() {
    return this.emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

}
