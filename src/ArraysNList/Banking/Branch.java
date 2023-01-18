package ArraysNList.Banking;

import java.util.ArrayList;

public class Branch {
    private final String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customer, double initialAmount) {
        if (findCustomer(customer) == null) {
            this.customers.add(new Customer(customer, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransactions(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransactions(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkCustomer = this.customers.get(i);
            if (checkCustomer.getName().equals(customerName)) {
                return checkCustomer;
            }
        }
        return null;
    }
}
