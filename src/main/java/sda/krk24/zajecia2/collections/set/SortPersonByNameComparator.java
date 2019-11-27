package sda.krk24.zajecia2.collections.set;

import java.util.Comparator;

public class SortPersonByNameComparator implements Comparator<Person> {

    public static SortPersonByNameComparator INSTANCE
            = new SortPersonByNameComparator();

    @Override
    public int compare(Person p1, Person p2) {
        return Comparator.comparing(Person::getName)
                .thenComparing(Person::getSurname)
                .thenComparing(Person::getAge)
                .compare(p1, p2);
    }

}
