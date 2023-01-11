package Challenges.Composition.theHouse;

public class Room {
  private Bed bed;
  private Mattress mattress;
  private Mirror mirror;
  private Closet closet;
  private Desktop desktop;

  public Room(Bed bed, Mattress mattress, Mirror mirror, Closet closet, Desktop desktop) {
    this.bed = bed;
    this.mattress = mattress;
    this.mirror = mirror;
    this.closet = closet;
    this.desktop = desktop;
  }

  public void amHere(){
    System.out.println("Yes i am in my room comfortable.");
  }


  public Bed getBed() {
    return bed;
  }

  public Mattress getMattress() {
    return mattress;
  }

  public Mirror getMirror() {
    return mirror;
  }

  public Closet getCloset() {
    return closet;
  }

  public Desktop getDesktop() {
    return desktop;
  }
}
