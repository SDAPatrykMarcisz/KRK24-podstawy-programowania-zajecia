package sda.krk24.zajecia2.time;

import java.lang.reflect.Constructor;

public class Person {
    String name;
    String surname;
    int age;

    @DefaultValues(name = "Patryk", surname = "Marcisz", age = 10)
    public Person() {
        for(Constructor constructor : Person.class.getConstructors()) {
            if (constructor.isAnnotationPresent(DefaultValues.class)) {
                DefaultValues annotation = (DefaultValues) constructor.getAnnotation(DefaultValues.class);
                this.name = annotation.name();
                this.surname = annotation.surname();
                this.age = annotation.age();
            }
        }
        // super(); //niejawny, domyslny
        // super() lub this()
    }

    public Person(String name) {
        this(name, "SURNAME", 50);
    }

    public Person(String name, String surname) {
        this(name, surname, 50);
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.age);
    }
}
