package sda.krk24.zajecia1.animals;

public abstract class Dog extends Animal {


    public Dog(int age) {
        super(age);
        System.out.println("Tworze Dog");
    }

    public int getAge(){
        return age;
    }
}
