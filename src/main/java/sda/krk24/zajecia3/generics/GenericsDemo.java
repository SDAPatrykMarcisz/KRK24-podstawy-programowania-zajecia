package sda.krk24.zajecia3.generics;

public class GenericsDemo {
    public static void main(String[] args) {

        FirstGeneric generic = new FirstGeneric("String");
        //FirstGeneric<Object> generic = new FirstGeneric("String");
        if (generic.getValue() instanceof String) {
            String value = (String) generic.getValue();
        }

        //jest bezpieczniejsze na etapie kompilacji
        FirstGeneric<String> genericString = new FirstGeneric<>("wartosc");
        String stringValue = genericString.getValue();

        //FirstGeneric<String> genericString2 = new FirstGeneric<String>(1);
        FirstGeneric<Animal> animal = new FirstGeneric<>(new Dog());

    }


}

class FirstGeneric<T> {
    private T value;

    public FirstGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

abstract class Animal {
    abstract void roar();
}

class Dog extends Animal {

    @Override
    void roar() {
        System.out.println("woff");
    }
}

class Cat extends Animal {

    @Override
    void roar() {
        System.out.println("meow");
    }
}
