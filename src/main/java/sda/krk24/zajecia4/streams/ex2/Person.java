package sda.krk24.zajecia4.streams.ex2;

public class Person {
    private String name;
    private String surname;
    private int age;
    private float height;
    private String comment;

    public Person(String name, String surname, int age, float height, String comment) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", comment='" + comment + '\'' +
                '}';
    }
}
