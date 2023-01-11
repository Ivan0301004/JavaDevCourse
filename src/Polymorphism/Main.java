package Polymorphism;

class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String plot() {
    return "No plot here";
  }

}


class theGodfather extends Movie {
  public theGodfather() {
    super("The Godfather");
  }

  @Override
  public String plot() {
    return "Family try to dominate all mafias in the country";
  }
}

class TaxiDriver extends Movie {
  public TaxiDriver() {
    super("Taxi Driver");
  }

  @Override
  public String plot() {
    return "A solitary man that drive a taxi in the nights";
  }
}

class Boyka extends Movie {
  public Boyka() {
    super("Undisputed");
  }

  @Override
  public String plot() {
    return "A jail fighter that beat all that bitches in it";
  }
}

class bladeRunner extends Movie {
  public bladeRunner() {
    super("Blade Runner");
  }

  @Override
  public String plot() {
    return "Family try to dominate all mafias in the country";
  }
}

class Whiplash extends Movie {
  public Whiplash() {
    super("Whiplash");
  }

  @Override
  public String plot() {
    return "A drummer jazz musician";
  }
}

class Joker extends Movie {
  public Joker() {
    super("Joker");
  }
}


public class Main {
  public static void main(String[] args) {
    for (int i = 1; i < 11; i++) {
      Movie movie = randomMovie();
      System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
    }
  }

  public static Movie randomMovie() {
    int random = (int) (Math.random() * 6) + 1;
    System.out.println("Random number is : " + random);
    return switch (random) {
      case 1 -> new theGodfather();
      case 2 -> new TaxiDriver();
      case 3 -> new Boyka();
      case 4 -> new bladeRunner();
      case 5 -> new Joker();
      case 6 -> new Whiplash();
      default -> null;
    };
  }
}
