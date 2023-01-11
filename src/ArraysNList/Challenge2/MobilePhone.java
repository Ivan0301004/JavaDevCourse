package ArraysNList.Challenge2;

import java.util.ArrayList;

public class MobilePhone {
  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
  }

  public boolean addNewContact(Contact contact) {
    if (findContact(contact.getName()) >= 0) {
      System.out.println("Contact is already on file");
      return false;

    }
    myContacts.add(contact);
    return true;
  }

  public boolean updateContact(Contact old, Contact newCon) {
    int position = findContact(old);
    if (position < 0) {
      System.out.println("Contact " + old.getName() + " was not found.");
      return false;
    } else if (findContact(newCon.getName()) != -1) {
      System.out.println("Contact with name : " + newCon.getName() + " Already exist. Error to add!!");
      return false;
    }
    this.myContacts.set(position, newCon);
    System.out.println(old.getName() + " was replace with " + newCon.getName());
    return true;
  }

  public boolean removeContact(Contact contact) {
    int position = findContact(contact);
    if (position < 0) {
      System.out.println(contact.getName() + ", was not found.");
    }
    this.myContacts.remove(contact);
    System.out.println(contact.getName() + " was deleted.");
    return true;
  }


  private int findContact(Contact contact) {
    return myContacts.indexOf(contact);
  }


  private int findContact(String name) {
    for (int i = 0; i < this.myContacts.size(); i++) {
      Contact contact = this.myContacts.get(i);
      if (contact.getName().equals(name)) {
        return i;
      }
    }
    return -1;
  }

  public String queryContact(Contact contact) {
    if (findContact(contact) >= 0) {
      return contact.getName();
    }
    return null;
  }

  public Contact queryContact(String name) {
    int pos = findContact(name);
    if (pos >= 0) {
      return this.myContacts.get(pos);
    }
    return null;
  }

  public void printContacts() {
    System.out.println("Contact list : ");
    for (int i = 0; i < this.myContacts.size(); i++) {
      System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " +
              this.myContacts.get(i).getPhoneNumber());
    }
  }
}
