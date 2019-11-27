package sda.krk24.zajecia4.streams.ex2;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        listOfList();
    }

    private static void ad1() {
        //Z listy osób wypisać imię i nazwisko osób,
        // których wiek jest większy od 20 lub wzrost
        // jest większy niż 1.75.

        List<Person> persons = getPersons();

        persons.stream()
                .filter(person -> person.getAge() < 20 || person.getHeight() > 1.75)
                .map(person -> person.getName() + person.getSurname())
                .forEach(person -> System.out.println(person));
    }

    //Posortuj listę osób w następujący sposób -
    // pierw nazwisko alfabetycznie rosnąco, następnie imię.
    private static void ex4() {
        List<Person> collect = getPersons().stream()
//                .sorted((x, y) -> x.getSurname().compareTo(y.getSurname()) == 0
//                        ? x.getName().compareTo(y.getName())
//                        : x.getSurname().compareTo(y.getSurname())
                .sorted(
                        Comparator.comparing(Person::getSurname)
                                .thenComparing(Person::getName)
                )
                .collect(Collectors.toList());
    }


    //Skonwertować listę do mapy, której kluczem będzie imię i nazwisko,
// a wartością będzie wiek osoby. (wygooglować sposób konwersji strumienia na mapę).
    private static void ex6() {
        Map<String, Integer> collect = getPersons().stream()
                .collect(Collectors.toMap(
                        person -> person.getSurname() + " " + person.getName(),
                        person -> person.getAge()
                ));
        System.out.println(collect);

        //dodatkowe zadanie: mapa w ktorej kluczem jest wiek,
        // a wartosciami lista osob z tym wiekiem
        Map<Integer, List<Person>> byAge = getPersons()
                .stream()
                .collect(Collectors.groupingBy(x -> x.getAge()));

        System.out.println(byAge);
    }


    //Posortuj listę list liczb całkowitych
    // za pomocą sumy ich elementów.
    public static void listOfList(){
        List<Integer> list1 = Arrays.asList(100,2,3,4,5);
        List<Integer> list2 = Arrays.asList(10,11,12);
        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);

        listOfList.stream()
                .sorted((x,y) -> {
                    int sumOfFirstElementList = x.stream().reduce(0, Integer::sum);
                    int sumOfSecondElementList = y.stream().reduce(0, Integer::sum);
                    return Integer.compare(sumOfFirstElementList, sumOfSecondElementList);
                })
                .forEach(System.out::println);
    }


    private static List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Patryk", "Marcisz", 27, 1.75f, ""));
        persons.add(new Person("Anna", "Marcisz", 27, 1.65f, ""));
        return persons;
    }
}
