package Challenges.Composition.THEPC;

public class Main {
  public static void main(String[] args) {
    Dimensions dimen = new Dimensions(4, 10, 10);
    Case theCase = new Case("2323", "Coolermaster", "243", dimen);
    Monitor monitor = new Monitor("27", "BenQ", 27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v22.4.4");

    PC thePC = new PC(theCase, monitor, theMotherboard);

    thePC.getTheMonitor().drawnPixel(3, 4, "Pink");
    thePC.getMotherborad().loadProgram("Arch Linux");
    thePC.getTheCase().pressButton();

    System.out.println("The manufacture of my motherboard is : " + thePC.getMotherborad().getManufacture());
    System.out.println("The model of my motherboard is : " + thePC.getMotherborad().getModel());
    System.out.println("The card slots of my motherboard is : " + thePC.getMotherborad().getCardSlots());
    System.out.println("The RAM slots of my motherboard is : " + thePC.getMotherborad().getRamSlots());
    System.out.println("The Bios slots of my motherboard is : " + thePC.getMotherborad().getBios());
  }
}
