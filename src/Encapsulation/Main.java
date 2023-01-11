package Encapsulation;

public class Main {
  public static void main(String[] args) {
//    Player iori = new Player();
//    iori.name = "Iori Yagami";
//    iori.health = 34;
//    iori.weapon ="Thunder";
//
//    System.out.println(iori.name);
//
//    System.out.println(iori.remainingHealth());
//    iori.loseHealth(23);
//    System.out.println(iori.remainingHealth());
//    iori.loseHealth(23);


    EnhancePlayer player = new EnhancePlayer("Iori", 120,"Sword");
    System.out.println("Initial health is : " + player.getHealth());


  }
}
