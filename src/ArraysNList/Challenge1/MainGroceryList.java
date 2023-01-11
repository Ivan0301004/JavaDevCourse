package ArraysNList.Challenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainGroceryList {
  private static final Scanner in = new Scanner(System.in);
  private static final GroceryList groceryList = new GroceryList();

  public static void main(String[] args) {
    boolean quit = false;
    int choice;
    printInstructions();
    while (!quit) {
      System.out.print("Enter your choice : ");
      choice = in.nextInt();
      in.nextLine();
      switch (choice) {
        case 1 -> printInstructions();
        case 2 -> addItem();
        case 3 -> groceryList.printGroceryList();
        case 4 -> modifyItem();
        case 5 -> removeItem();
        case 6 -> findItem();
        case 7 -> processArrayList();
        case 8 -> quit = true;
        default -> System.out.println("Wrong input");
      }
    }
  }

  public static void printInstructions() {
    System.out.println("\t1. See the menu");
    System.out.println("\t2. Add Grocery Item List");
    System.out.println("\t3. Print Grocery List");
    System.out.println("\t4. Modify grocery item");
    System.out.println("\t5. Remove item");
    System.out.println("\t6. Find item");
    System.out.println("\t7. Process Array List");
    System.out.println("\t8. Quit");
  }

  public static void addItem() {
    System.out.print("Enter the name of the item : ");
    groceryList.addGroceryItem(in.nextLine());
  }


  public static void modifyItem() {
    System.out.print("Current item name : ");
    String pos = in.nextLine();
    System.out.print("Enter the replacement item : ");
    String name = in.nextLine();
    groceryList.modifyGroceryItem(pos, name);
  }

  public static void removeItem() {
    System.out.print("Enter item name : ");
    String pos = in.nextLine();
    groceryList.removeGroceryItem(pos);
  }

  public static void findItem() {
    System.out.print("Enter the name of the item : ");
    String name = in.nextLine();
    if (groceryList.onFile(name)) {
      System.out.println("Found " + name + " in the list.");
    } else {
      System.out.println(name + " is not found.");
    }
  }

  public static void processArrayList() {
    ArrayList<String> newArray = new ArrayList<String>();
    newArray.addAll(groceryList.getGroceryList());

    ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
    String[] myArray = new String[groceryList.getGroceryList().size()];
    myArray = groceryList.getGroceryList().toArray(myArray);
  }
}
