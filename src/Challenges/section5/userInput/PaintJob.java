package Challenges.section5.userInput;

public class PaintJob {
  public static void main(String[] args) {
    System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
    System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    System.out.println();
    System.out.println(getBucketCount(-3.4, 2.1, 1.5));
    System.out.println(getBucketCount(3.4, 2.1, 1.5));
    System.out.println(getBucketCount(7.25, 4.3, 2.35));
    System.out.println();
    System.out.println(getBucketCount(3.4, 1.5));
    System.out.println(getBucketCount(6.26, 2.2));
    System.out.println(getBucketCount(3.26, 0.75));


    System.out.println("Math period round : " + Math.ceil(13.265957447));
    /*
     * should return 3 cause since the wall area is 7.14 a single bucket
     * can cover an area of 1.5  and Bob  has 2 extra  buckets at home
     *
     */
  }

  /*
   * width = width of the wall
   * height = height of the wall
   * areaPerBucket = area that can paint with one bucket
   * extraBuckets = the buckets that man has at home
   *
   */
  public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0) {
      return -1;
    }

    double areaWall = width * height;  // return the area of wall
    double bucketsPerArea = Math.ceil((areaWall / areaPerBucket) - extraBuckets); // should return the amount of buckets that i need

    return (int) bucketsPerArea;
  }

  public static int getBucketCount(double width, double height, double areaPerBucket) {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
      return -1;
    }

    double areaWall = width * height;  // return the area of wall
    double bucketsPerArea = Math.ceil((areaWall / areaPerBucket)); // should return the amount of buckets that i need

    return (int) bucketsPerArea;

  }

  public static int getBucketCount(double area, double areaPerBucket) {
    if (area <= 0 || areaPerBucket <= 0) {
      return -1;
    }

    return (int) Math.ceil(area / areaPerBucket);
  }
}
