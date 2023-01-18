package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    LinkedList<String> placesToVisit = new LinkedList<String>();
    addInOrder(placesToVisit, "Tokyo");
    addInOrder(placesToVisit, "Mexico Ciy");
    addInOrder(placesToVisit, "Mexico Ciy");
    addInOrder(placesToVisit, "Berlin");
    addInOrder(placesToVisit, "Berlin");
    addInOrder(placesToVisit, "Osaka");
    addInOrder(placesToVisit, "Beijing");
    addInOrder(placesToVisit, "Hong Kong");

    printList(placesToVisit);
    visit(placesToVisit);

  }

  private static void printList(LinkedList<String> list) {
    for (String s : list) {
      System.out.println("Now visiting : " + s);
    }
    System.out.println("===============================");
  }

  private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
    ListIterator<String> stringListIterator = linkedList.listIterator();
    while (stringListIterator.hasNext()) {
      int comparison = stringListIterator.next().compareTo(newCity);
      if (comparison == 0) {
        System.out.println(newCity + " is already included as a destination.");
        return false;
      } else if (comparison > 0) {
        stringListIterator.previous();
        stringListIterator.add(newCity);
        return true;
      } else if (comparison < 0) {

      }
    }
    stringListIterator.add(newCity);
    return true;
  }

  private static void visit(LinkedList cities) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true;

    ListIterator<String> listIterator = cities.listIterator();

    if (cities.isEmpty()) {
      System.out.println("No cites in the itinerary");
      return;
    } else {
      System.out.println("now visiting " + listIterator.next());
      printMenu();
    }

    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch (action) {
        case 0 -> {
          System.out.println("Holiday (Vacation) over.");
          quit = true;
        }
        case 1 -> {
          if (!goingForward) {
            if (listIterator.hasNext()) {
              listIterator.next();
            }
            goingForward = true;
          }

          if (listIterator.hasNext()) {
            System.out.println("Now visiting " + listIterator.next());
          } else {
            System.out.println("Reached the end of the list.");
            goingForward = false;
          }
        }
        case 2 -> {
          if (goingForward) {
            if (listIterator.hasPrevious()) {
              listIterator.previous();
            }
            goingForward = false;
          }

          if (listIterator.hasPrevious()) {
            System.out.println("Now visiting " + listIterator.previous());
          } else {
            System.out.println("We are at start of the list.");
            goingForward = true;
          }
        }
        case 3 -> {
          printMenu();
        }
      }
    }
  }

  private static void printMenu() {
    System.out.println("Available actions:\nPress");
    System.out.println("""
            0 - to quit
            1 - go to the next city
            2 - go to previous city
            3 - print menu options
             """);
  }
}






















