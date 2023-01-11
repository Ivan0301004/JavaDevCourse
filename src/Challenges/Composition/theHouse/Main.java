package Challenges.Composition.theHouse;

public class Main {
  public static void main(String[] args) {
    Mattress mattress = new Mattress("White", "KingSize", "Sognare");
    Bed bed = new Bed("KingSize", 4000, "Wood", mattress);
    Mirror mirror = new Mirror(100, 400);
    Closet closet = new Closet("Wood", mirror, 150, 200, 200);
    Desktop desktop = new Desktop("Metal", 150, 100);


    Room room = new Room(bed, mattress, mirror, closet, desktop);

    room.amHere();
    room.getBed().sleep(9);


  }
}
