package ClassesConstructorsInheritance.Constructors;

public class mainCustomer {
  public static void main(String[] args) {

    VipCustomer empty = new VipCustomer();
    System.out.println("Empty name : " + empty.getName());
    System.out.println("Empty credit limit : " + empty.getCreditLimit());
    System.out.println("Empty email address : " + empty.getEmailAddress());

    System.out.println();

    VipCustomer italia = new VipCustomer("Italia", 230.0);
    System.out.println("Italia name : " + italia.getName());
    System.out.println("Italia creditLimit: " + italia.getCreditLimit());

    System.out.println();

    VipCustomer valentina = new VipCustomer("Valentina", 30000.45, "ValHermosa@gmail.com");
    System.out.println("valentina name : " + valentina.getName());
    System.out.println("valentina credit : " + valentina.getCreditLimit());
    System.out.println("valentina email: " + valentina.getEmailAddress());
  }
}
