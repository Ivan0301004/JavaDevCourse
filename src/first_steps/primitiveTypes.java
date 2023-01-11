package first_steps;

public class primitiveTypes {
  public static void main(cadenas[] args) {
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;

    System.out.println("Int Min value : " + min);
    System.out.println("Int Max Value : " + max);
    System.out.println("Busted Max : " + (max + 1));
    System.out.println("Busted Min : " + (min - 1));

    byte minByte = Byte.MIN_VALUE;
    byte maxByte = Byte.MAX_VALUE;
    System.out.println("Byte min  : " + minByte);
    System.out.println("Byte max  : " + maxByte);

    short minShort = Short.MIN_VALUE;
    short maxShort = Short.MAX_VALUE;
    System.out.println("Short min : " + minShort);
    System.out.println("Short max : " + maxShort);

    float minFloat = Float.MIN_VALUE;
    float maxFloat = Float.MAX_VALUE;
    System.out.println("Float min : " + minFloat);
    System.out.println("Float max : " + maxFloat);

    double minDouble = Double.MIN_VALUE;
    double maxDouble = Double.MAX_VALUE;
    System.out.println("Double min : " + minDouble );
    System.out.println("Double max : " + maxDouble);

    long minLong = Long.MIN_VALUE;
    long maxLong = Long.MAX_VALUE;
    System.out.println("Long min : " + minLong);
    System.out.println("Long max : " + maxLong);

    byte new_value = (byte) (minByte / 2);
    System.out.println("Casting byte : " + new_value);
  }
}
