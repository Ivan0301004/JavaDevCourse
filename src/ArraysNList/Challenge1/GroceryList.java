package ArraysNList.Challenge1;

import java.util.ArrayList;

public class GroceryList {
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_PURPLE = "\u001B[35m";


  private final ArrayList<String> groceryList = new ArrayList<String>();

  public void addGroceryItem(String item) {
    groceryList.add(item);
  }

  public ArrayList<String> getGroceryList() {
    return groceryList;
  }

  public void printGroceryList() {
    System.out.println("You have " + groceryList.size() + " items.");
    for (int i = 0; i < groceryList.size(); i++) {
      System.out.println( ANSI_PURPLE + (i + 1) + ". " + groceryList.get(i) + ANSI_RESET);
    }
  }

  public void modifyGroceryItem(String currentItem, String newItem) {
    int position = findItem(currentItem);
    if (position >= 0) {
      modifyGroceryItem(position, newItem);
    }
  }

  private void modifyGroceryItem(int position, String item) {
    groceryList.set(position, item);
    System.out.println("Grocery item " + (position + 1) + " has been modify.");
  }


  public void removeGroceryItem(String newItem) {
    int position = findItem(newItem);
    if (position >= 0) {
      removeGroceryItem(position);
    }
  }

  private void removeGroceryItem(int position) {
    groceryList.remove(position);
  }

  private int findItem(String searchItem) {
    return groceryList.indexOf(searchItem);
  }

  public boolean onFile(String searchItem) {
    int item = findItem(searchItem);
    return item >= 0;
  }
}
