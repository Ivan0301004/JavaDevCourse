package functionalProgramming;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
            new Person("Julieta", 17),
            new Person("Jereni", 16),
            new Person("Avalon", 18),
            new Person("Ivan", 19),
            new Person("Ema", 18),
            new Person("Michelle", 19)
        );


        List<Person> ascendingOrder =
            people.stream()
                .sorted((person1, person2) -> person2.getDifference(person1))
                .collect(toList());
        printPeople("Sorted in ascending order by age:  ", ascendingOrder);

        System.out.println();

        people.stream()
            .min(Person::getDifference)
            .ifPresent(young -> System.out.println("Youngest : " + young));

        people.stream()
            .max(Person::getDifference)
            .ifPresent(eldest -> System.out.println("Eldest : " + eldest));

        System.out.println();

        Map<Integer, List<Person>> peopleByAge =
            people.stream()
                .collect(Collectors.groupingBy(Person::getAge));


        System.out.println("Grouped by age : " + peopleByAge);
    }

    public static void printPeople(final String message, final List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    }
}
