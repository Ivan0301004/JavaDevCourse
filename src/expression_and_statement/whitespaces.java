package expression_and_statement;

public class whitespaces {
  public static void hello() {
    System.out.println("Hello from my future work as a Java programmer");
  }

  public static void main(String[] args) {
    int avg = calculateScorePosition(900);
    displayScoreHighPosition("Ivan", avg);
    avg = calculateScorePosition(450);
    displayScoreHighPosition("Dylan", avg);
    avg = calculateScorePosition(120);
    displayScoreHighPosition("Messi", avg);
    avg = calculateScorePosition(2300);
    displayScoreHighPosition("Fernando", avg);
    avg = calculateScorePosition(1000);
    displayScoreHighPosition("Fatima", avg);

    hello();
    score(30, 7);

    System.out.println("Suma int : " + suma(23, 43));
    System.out.println("Suma double : " + suma(45, 34.5));

  }

  public static double score(double num, double div) {
    System.out.println("The div is : " + num / div);
    return -1;
  }

  public static void displayScoreHighPosition(String name, int score) {
    System.out.println(name + " Managed to get into position " + score + " on the high score table");
  }

  public static int calculateScorePosition(int scorePosition) {
    if (scorePosition >= 1000) {
      return 1;
    } else if (scorePosition >= 500 && scorePosition < 1000) {
      return 2;
    } else if (scorePosition >= 100 && scorePosition < 500) {
      return 3;
    } else {
      return 4;
    }
  }

  public static int suma(int x, int y) {
    return x + y;
  }

  public static double suma(int x, double y) {
    return x / y;
  }
}
