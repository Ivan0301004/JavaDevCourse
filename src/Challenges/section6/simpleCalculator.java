package Challenges.section6;

public class simpleCalculator {

  private double firstNumber;
  private double secondNumber;

  public double getFirstNumber() {
    return firstNumber;
  }

  public double getSecondNumber() {
    return secondNumber;
  }

  public void setFirstNumber(double first) {
    this.firstNumber = first;
  }

  public void setSecondNumber(double second) {
    this.secondNumber = second;
  }

  public double getAdditionResult() {
    return getFirstNumber() + getSecondNumber();
  }

  public double getSubtractionResult() {
    return getFirstNumber() - getSecondNumber();
  }

  public double getMultiplicationResult() {
    return getFirstNumber() * getSecondNumber();
  }

  public double getDivisionResult() {
    double parse;
    if (getSecondNumber() == 0) {
      parse = 0.0;
    } else {
      parse = getFirstNumber() / getSecondNumber();

    }
    return parse;
  }

}
