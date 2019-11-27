package sda.krk24.zajecia4.streams.ex1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreams {
    //stwórz strumień z pięcioma elementami typu String:
    // "first"  "second"  "third"  "fourth" "fifth"
    // z utworzonego strumienia zwróć słowa dłuższe niż 5 znaków
    // oraz zwróć je w formacie UPPERCASE

    public static void main(String[] args) {
        zadanie2();
    }

    private static void zadanie2(){
        Optional<String> first = Stream.of(new String[]{"firstValue", "second", "third", "fourth", "fifth"})
                .filter(x -> x.length() > 7)
                .findFirst();

        String s = first.get();
        System.out.println(s);

    }

    private static void zadanie1() {
        //uzywajac metody Stream.of
        Stream<String> stream1 = Stream.of("first", "second", "third", "fourth", "fifth");

        String[] stringTable = {"first", "second", "third", "fourth", "fifth"};
        Stream<String> stream2 = Stream.of(stringTable);

        //metoda stream() na obiekcie kolekcji
        List<String> stringList = new ArrayList<>();
        stringList.add("first");
        stringList.add("second");
        stringList.add("third");
        stringList.add("fourth");
        stringList.add("fifth");
        Stream<String> stream3 = stringList.stream();

        Stream<String> stream4 = Arrays.asList("first", "second", "third", "fourth", "fifth").stream();
        Stream<String> stream5 = new ArrayList(Arrays.asList("first", "second", "third", "fourth", "fifth")).stream();

        List<String> collectedStrings = stream1
                .filter(string -> string.length() > 5)
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());

        Stream<String> stringStream = stream2.filter(string -> string.length() > 5);
        Stream<String> stringStreamPhase2 = stringStream.map(string -> string.toUpperCase());
        List<String> collect = stringStreamPhase2.collect(Collectors.toList());

        //tutaj bedzie error stream has already been operated upon or closed
        //wynika to z faktu ze wywolujac operacje terminalna - konczca typu collect()
        //zamykamy stream i nie mozemy go ponownie uzyc.

        stream5.findFirst();

        Set<String> collectToSet = stringStreamPhase2.collect(Collectors.toSet());

        System.out.println(collectedStrings);
    }


}
