package sda.krk24.zajecia2.collections;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        Comparable<Integer> a = new Comparable<>() {
            @Override
            public int compareTo(@NotNull Integer o) {
                return -1;
            }
        };

        Comparable<Integer> c = (Integer o) -> -1;
        Comparable<Integer> b = x -> -1;

        c.compareTo(4);


        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Predicate<Integer> valueHigherThan3 = x -> {
            System.out.println(x);
            return x > 3;
        };

        Predicate<Integer> valueHigherThan3Impl = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                System.out.println(x);
                return x > 3;
            }
        };

        Function<Integer, String> convertToString = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return Integer.toString(integer);
            }
        };

        Function<Integer, String> convertToString2 = integer -> Integer.toString(integer);

        String convertResult = convertToString2.apply(5);

        valueHigherThan3Impl.test(4);

        boolean test = valueHigherThan3.test(4);

        List<String> collect = integers.stream()
                .filter(valueHigherThan3)
                .map(x -> Integer.toString(x))
                .collect(Collectors.toList());

    }
}
