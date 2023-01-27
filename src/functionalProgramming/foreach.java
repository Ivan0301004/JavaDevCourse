package functionalProgramming;

public class foreach {
    public static void main(String[] args) {
        final String str = "w00t";

        str.chars()
            .forEach(System.out::println);

        System.out.println();

        str.chars()
            .mapToObj(ch -> (char) ch)
            .forEach(ch -> System.out.print(ch + " "));

        System.out.println("\n");

        str.chars()
            .filter(Character::isDigit)
            .forEach(foreach::printChar);
    }

    private static void printChar(int aChar) {
        System.out.println((char) (aChar));
    }
}
