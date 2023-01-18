package ArraysNList.Banking;

import java.util.ArrayList;

public class Bank {
  private final String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<Branch>();
  }

  public boolean addBranch(String branchName) {
    if (findBranch(branchName) == null) {
      this.branches.add(new Branch(branchName));
      return true;
    }
    return false;
  }

  public boolean addCustomer(String branchName, String customerName, double initialAmount) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      return branch.newCustomer(customerName, initialAmount);
    }
    return false;
  }

  public boolean addCustomerTransactions(String branchName, String customerName, double amount) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      return branch.addTransactions(customerName, amount);
    }
    return false;
  }

  private Branch findBranch(String name) {
    for (Branch checkBranch : this.branches) {
      if (checkBranch.getName().equals(name)) {
        return checkBranch;
      }
    }
    return null;
  }

  public boolean listCustomers(String nameBranch, boolean showTransactions) {
    Branch branch = findBranch(nameBranch);
    if (branch != null) {
      System.out.println("Customer details for branch " + branch.getName());

      ArrayList<Customer> branchCustomers = branch.getCustomers();
      for (int i = 0; i < branchCustomers.size(); i++) {
        Customer branchCustomer = branchCustomers.get(i);
        System.out.println((i + 1) + ".- Customer : " + branchCustomer.getName());
        if (showTransactions) {
          System.out.println("Transactions ");
          ArrayList<Double> transactions = branchCustomer.getTransactions();
          for (int j = 0; j < transactions.size(); j++) {
            System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
          }
        }
      }
      return true;
    } else {
      return false;
    }
  }
}
