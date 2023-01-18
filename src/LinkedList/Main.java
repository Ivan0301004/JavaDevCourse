package LinkedList;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Customer customer = new Customer("Ivan", 23.0);
    Customer newCustomer;
    newCustomer = customer;
    newCustomer.setBalance(2334.67);
    System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(23);
    numbers.add(43);
    numbers.add(90);

    for (int i = 0; i < numbers.size(); i++) {
      System.out.println("Num " + (i + 1) + " = " + numbers.get(i));
    }

    numbers.add(0, 344);
    numbers.set(2, 12314);
    System.out.println();

    for (int i = 0; i < numbers.size(); i++) {
      System.out.println("Num " + (i + 1) + " = " + numbers.get(i));
    }
  }
}
