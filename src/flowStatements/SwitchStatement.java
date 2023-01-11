package flowStatements;

import java.util.Scanner;

public class SwitchStatement {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    char letter;

    System.out.print("Enter a character : ");
    letter = user.next().charAt(0);

    switch (Character.toUpperCase(letter)) {

      default:
        System.out.println("Not found");
        break;
      case 'A':
        System.out.println("Letter found");
        break;
      case 'B':
        System.out.println("Letter found");
        break;
      case 'C': case 'D': case'E':
        System.out.println(Character.toUpperCase(letter) + " Was found");
        break;
    }
  }
}
