package Challenges.Composition.theHouse;

public class Closet {
  private String material;
  private Mirror mirror;
  private int depth;
  private int width;
  private int height;


  public Closet(String material, Mirror mirror, int depth, int width, int height) {
    this.material = material;
    this.mirror = mirror;
    this.depth = depth;
    this.width = width;
    this.height = height;
  }

  public String getMaterial() {
    return material;
  }

  public Mirror getMirror() {
    return mirror;
  }

  public int getDepth() {
    return depth;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
}
