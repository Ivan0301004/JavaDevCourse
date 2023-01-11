package Encapsulation.Challenge;

public class Main {
  public static void main(String[] args) {
    Printer hola = new Printer(70, false);
    System.out.println("Initial pages count " + hola.getPAgesPrinted());

    int pages = hola.printPages(4);
    System.out.println("Pages printed was " + pages + " new total are : " + hola.getPAgesPrinted());
    pages = hola.printPages(1);
    System.out.println("Pages printed was " + pages + " new total are : " + hola.getPAgesPrinted());
    System.out.println("The toner level is " + hola.getTonerLevel());
    int toner  = hola.addToner(23);
    System.out.println("The toner level is " + hola.getTonerLevel());
  }
}
