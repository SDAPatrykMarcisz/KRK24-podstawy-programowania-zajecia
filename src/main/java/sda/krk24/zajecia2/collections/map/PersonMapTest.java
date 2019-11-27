package sda.krk24.zajecia2.collections.map;

import sda.krk24.zajecia2.collections.set.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMapTest {
    public static void main(String[] args) {
        putGet();

        HashMap<Person, List<Person>> klasy = new HashMap<>();
        Person nauczyciel = new Person("Anna", "Danuta", 30);

        Person uczen1 = new Person("Imie1", "Nazwisko1", 1);
        Person uczen2 = new Person("Imie2", "Nazwisko2", 2);
        Person uczen3 = new Person("Imie3", "Nazwisko3", 3);
        Person uczen4 = new Person("Imie4", "Nazwisko4", 4);

        List<Person> uczniowie = new ArrayList<>();
        uczniowie.add(uczen1);
        uczniowie.add(uczen2);
        uczniowie.add(uczen3);
        uczniowie.add(uczen4);

        klasy.put(nauczyciel, new ArrayList<>(uczniowie));

        List<Person> listFromMap = klasy.get(new Person("Anna", "Danuta", 30));
        System.out.println(listFromMap);

        Person uczen5 = new Person("Imie 5", "nazwisko 5", 5);
        listFromMap.add(uczen5);

        System.out.println("--------------------");
        System.out.println(uczniowie);
        System.out.println(listFromMap);

        //wszystkie klucze
        for(Person p : klasy.keySet()){
            System.out.println(p);
        }

        //wszystkie wartosci
        for(List<Person> value : klasy.values()){
            System.out.println(value);
        }

        //wszyskie klucze i powiazane z nimi wartosci
        for(Map.Entry<Person, List<Person>> entry : klasy.entrySet()){
            Person key = entry.getKey();
            List<Person> value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }

    private static void putGet() {
        HashMap<Integer, Person> dziennik = new HashMap<>();
        Person p1 = new Person("Hanna", "Mostowiak", 8);
        Person p2 = new Person("Wioletta", "X", 2);

        dziennik.put(1, p1);
        dziennik.put(2, p2);
        dziennik.put(4, p1);

        Person p3 = dziennik.get(3);
        System.out.println(p3);

        Person p4 = dziennik.get(4);
        System.out.println(p4);
    }
}
