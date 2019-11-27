package sda.krk24.zajecia1.animals;

public abstract class Animal {

    int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("Tworze animal");
    }

    public static void main(String[] args) {
        Animal a = new Chart(2);
    }
}
