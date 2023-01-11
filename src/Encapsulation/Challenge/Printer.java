package Encapsulation.Challenge;

public class Printer {
  private int tonerLevel;
  private int pagesPrinted;
  private boolean duplex;


  public Printer(int tonerLevel, boolean duplex) {
    if (tonerLevel > -1 && tonerLevel <= 100) {
      this.tonerLevel = tonerLevel;
    } else {
      this.tonerLevel = -1;
    }

    this.duplex = duplex;
    this.pagesPrinted = 0;
  }

  public int addToner(int toner) {
    if (toner > 0 && toner <= 100) {
      if (this.tonerLevel + toner > 100) {
        return -1;
      } else {
        this.tonerLevel += toner;
        return this.tonerLevel;
      }
    } else {
      return -1;
    }
  }

  public int printPages(int pages) {
    int pagesToPrint = pages;
    if (this.duplex) {
      pagesToPrint = (pages / 2) + (pages % 2);
      System.out.println("Printing ni duplex mode");
    }
    this.pagesPrinted += pagesToPrint;

    return pagesToPrint;
  }

  public int getPAgesPrinted() {
    return pagesPrinted;
  }

  public int getTonerLevel() {
    return this.tonerLevel;
  }
}
