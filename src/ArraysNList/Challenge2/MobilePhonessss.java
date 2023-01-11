package ArraysNList.Challenge2;

import java.util.ArrayList;

public class MobilePhonessss {

  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhonessss(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
  }

  public boolean addNewContact(Contact contact) {
    if (findContact(contact.getName()) < 0) {
      myContacts.add(contact);
      return true;
    } else {
      return false;
    }
  }

  public boolean updateContact(Contact oldContact, Contact newContact) {
    int position = findContact(oldContact);
    if (position < 0) {
      System.out.println("Contact not found, no update performed");
      return false;
    } else {
      myContacts.set(position, newContact);
      System.out.println(newContact.getName() + " added to the list");
      return true;
    }
  }

  public boolean removeContact(Contact contact) {
    int position = findContact(contact);
    if (position < 0) {
      System.out.println(contact.getName() + " doesn't exist, can't remove");
      return false;
    } else {
      System.out.println(contact.getName() + " removed from the contact list");
      myContacts.remove(position);
      return true;
    }
  }

  private int findContact(Contact contact) {
    return (myContacts.contains(contact) ? myContacts.indexOf(contact) : -1);
  }

  private int findContact(String name) {
    for (Contact contact : myContacts) {
      if (contact.getName().equals(name)) {
        return myContacts.indexOf(contact);
      }
    }
    return -1;
  }

  public Contact queryContact(String contactStr) {
    int position = findContact(contactStr);
    return (position < 0 ? null : myContacts.get(position));
  }

  public void printContacts() {
    System.out.println("Contact List:");
    for (Contact contact : myContacts) {
      System.out.println((myContacts.indexOf(contact) + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
    }
  }
}

