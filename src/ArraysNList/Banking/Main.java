package ArraysNList.Banking;

public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank("BBVA Bancomer");

    bank.addBranch("Adeline");
    bank.addCustomer("Adeline", "Ivan", 200.23);
    bank.addCustomer("Adeline", "Julieta", 230.90);
    bank.addCustomer("Adeline", "Dulce", 100.32);

    bank.addBranch("Sidney");
    bank.addCustomer("Sidney", "Emma", 230.9);

    bank.addCustomerTransactions("Adeline","Ivan",320.98);
    bank.addCustomerTransactions("Adeline","Julieta",20.98);

    bank.listCustomers("Adeline", true);
    bank.listCustomers("Sidney", false);

  }
}
