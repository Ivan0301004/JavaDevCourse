package ArraysNList.Challenge2;

import java.util.Scanner;

public class Main {
  private static final Scanner us = new Scanner(System.in);
  private static final MobilePhone mobilePhone = new MobilePhone("12 121 32 231");

  public static void main(String[] args) {
    boolean quit = false;
    startPhone();
    printActions();
    while (!quit) {
      System.out.print("\nEnter action: (6 to show all) : ");
      int action = us.nextInt();
      us.nextLine();

      switch (action) {
        case 0:
          System.out.println("Shooting down...");
          quit = true;
          break;
        case 1:
          mobilePhone.printContacts();
          break;
        case 2:
          addNewContact();
          break;
        case 3:
          updateContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          queryContact();
          break;
        case 6:
          printActions();
        default:
          System.out.println("Wrong choice. Try again");

      }
    }
  }


  private static void addNewContact() {
    System.out.println("Enter the name and number for the new contact : ");
    System.out.print("Name : ");
    String name = us.nextLine();
    System.out.print("Phone number : ");
    String phoneNumber = us.nextLine();
    Contact con = Contact.createContact(name, phoneNumber);

    if (mobilePhone.addNewContact(con)) {
      System.out.println("New contact added: " + con.getName() + " Phone Number : " + con.getPhoneNumber());
    } else {
      System.out.println("Cannot add " + name + " already on file.");
    }
  }

  private static void updateContact() {
    System.out.print("Enter the name of your current contact : ");
    String name = us.nextLine();
    Contact existingContactRecord = mobilePhone.queryContact(name);
    if (existingContactRecord == null) {
      System.out.println("Contact not found");
      return;
    }

    System.out.print("Enter the new contact Name : ");
    String newName = us.nextLine();
    System.out.print("Enter the new contact phone number : ");
    String newNumber = us.nextLine();
    Contact newContact = Contact.createContact(newName, newNumber);

    if (mobilePhone.updateContact(existingContactRecord, newContact)) {
      System.out.println("Successfully update record");
    } else {
      System.out.println("Cannot update new record");
    }
  }

  private static void removeContact() {
    System.out.print("Enter the name of your current contact : ");
    String name = us.nextLine();
    Contact existingContactRecord = mobilePhone.queryContact(name);
    if (existingContactRecord == null) {
      System.out.println("Contact not found");
      return;
    }

    if (mobilePhone.removeContact(existingContactRecord)) {
      System.out.println("Successfully deleted");
    } else {
      System.out.println("Cannot remove the contact");
    }
  }

  private static void queryContact() {
    System.out.print("Enter the name of your current contact : ");
    String name = us.nextLine();
    Contact existingContactRecord = mobilePhone.queryContact(name);
    if (existingContactRecord == null) {
      System.out.println("Contact not found");
      return;
    }

    System.out.println("Name : " + existingContactRecord.getName() + "\nPhone numbers is : " +
            existingContactRecord.getPhoneNumber());
  }

  private static void startPhone() {
    System.out.println("Starting phone...");
  }

  private static void printActions() {
    System.out.println("\nAvailable actions:\nPress.");
    System.out.println("""
            0. Shutdown
            1. Print Contacts
            2. Add new contact
            3. Update contacts
            4. Remove Contacts
            5. Query if an existing contact exist
            6. Print list available actions
            """);
    System.out.print("Choose your action : ");
  }
}
