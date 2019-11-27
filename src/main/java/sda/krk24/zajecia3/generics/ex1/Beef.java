package sda.krk24.zajecia3.generics.ex1;

public class Beef extends Food {
    public Beef(String name, String weigth) {
        super(name, weigth);
    }

    @Override
    void prepare() {
        System.out.println(name);
    }
}
