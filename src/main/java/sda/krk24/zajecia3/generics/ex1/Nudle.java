package sda.krk24.zajecia3.generics.ex1;

public class Nudle extends Food {
    public Nudle(String name, String weigth) {
        super(name, weigth);
    }

    @Override
    void prepare() {
        System.out.println(name);
    }
}
