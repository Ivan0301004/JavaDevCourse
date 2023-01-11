package Challenges.Composition.THEPC;

public class PC {
  private Case theCase;
  private Monitor theMonitor;
  private Motherboard motherborad;


  public PC(Case theCase, Monitor theMonitor, Motherboard motherborad) {
    this.theCase = theCase;
    this.theMonitor = theMonitor;
    this.motherborad = motherborad;
  }




  public Case getTheCase() {
    return theCase;
  }

  public Monitor getTheMonitor() {
    return theMonitor;
  }

  public Motherboard getMotherborad() {
    return motherborad;
  }
}
