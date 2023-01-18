package ArraysNList.Banking;

import java.util.ArrayList;

public class Customer {
  private final String name;
  private final ArrayList<Double> transactions;

  public Customer(String name, double initialAmount){
    this.name = name;
    this.transactions = new ArrayList<Double>();
    addTransactions(initialAmount);
  }

  public void addTransactions(double amount){
    this.transactions.add(amount);
  }

  public String getName(){
    return name;
  }

  public ArrayList<Double>  getTransactions(){
    return this.transactions;
  }

}
