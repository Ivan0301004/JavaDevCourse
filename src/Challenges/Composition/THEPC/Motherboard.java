package Challenges.Composition.THEPC;

public class Motherboard {
  private String model;
  private String manufacture;
  private int ramSlot;
  private int cardSlot;
  private String bios;

  public Motherboard(String model, String manufacture, int ramSlots, int cardSlots, String bios) {
    this.model = model;
    this.manufacture = manufacture;
    this.ramSlot = ramSlots;
    this.cardSlot = cardSlots;
    this.bios = bios;
  }


  public void loadProgram(String program) {
    System.out.println("Program " + program + " is now loading...");
  }


  public String getModel() {
    return model;
  }

  public String getManufacture() {
    return manufacture;
  }

  public int getRamSlots() {
    return ramSlot;
  }

  public int getCardSlots() {
    return cardSlot;
  }

  public String getBios() {
    return bios;
  }


}
