package ArraysNList.Banking;

import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customers;

  public Branch(String name){
    this.name = name;
    
  }

  public String getName(){
    return this.name;
  }

  public void hola(){
    System.out.println("Hello");
  }

}
