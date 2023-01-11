package Challenges.section4;

public class byes {

  public static void main(String[] args) {
    printMegBytesAndKiloBytes(0);
  }

  public static void printMegBytesAndKiloBytes(int bytes) {
    final int MB = 1024;
    if (bytes < 0){
      System.out.println("Invalid Value");
      return;
    }

    int MBytes = bytes / 1024;
    int KB = bytes % MB;
    System.out.printf("%d = %d MB and %d KB\n", bytes, MBytes, KB);
  }

}
