package sda.krk24.zajecia2.collections.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonSetTest {
    public static void main(String[] args) {

        Person p1 = new Person("Adam", "Kowalski", 20);
        Person p2 = new Person("Adam", "Kowalski", 35);
        Person p3 = new Person("Jerzy", "Ziutek", 37);
        Person p4 = new Person("Korwin", "Mikke", 40);

        //1 przypadek, sortowanie po nazwisku
        Set<Person> sortedBySurname = new TreeSet<>();
        sortedBySurname.add(p1);
        sortedBySurname.add(p2);
        sortedBySurname.add(p3);
        sortedBySurname.add(p4);

        convertToArrayAndPrint(sortedBySurname);

//        Set<Person> sortedByName = new TreeSet<>(new SortPersonByNameComparator());
        Set<Person> sortedByName = new TreeSet<>(SortPersonByNameComparator.INSTANCE);
        sortedByName.addAll(sortedBySurname);
        convertToArrayAndPrint(sortedByName);

//        Set<Person> sortedByAge = new TreeSet<>((x,y) -> Integer.compare(x.getAge(), y.getAge()));
        Set<Person> sortedByAge = new TreeSet<>(Comparator.comparingInt(Person::getAge));
        sortedByAge.addAll(sortedBySurname);
        convertToArrayAndPrint(sortedByAge);

    }

    private static void convertToArrayAndPrint(Set<Person> sortedByName) {
        Person[] peoples = sortedByName.toArray(new Person[0]);
        System.out.println(Arrays.toString(peoples));
    }
}
