package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class one {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println(
            values.stream()
                .filter(e -> e > 3)
                .filter(e -> e % 3 == 0)
                .map(e -> e * 2)
                .findAny()
                .get());
    }
}


