package Challenges.Composition.theHouse;

public class Desktop {
  private String material;
  private int width;
  private int height;

  public Desktop(String material, int width, int height) {
    this.material = material;
    this.width = width;
    this.height = height;
  }

  public String getMaterial() {
    return material;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
}
