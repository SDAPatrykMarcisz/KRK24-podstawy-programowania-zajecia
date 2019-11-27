package sda.krk24.zajecia3.generics.ex1;

public abstract class Food {
    protected final String name;
    protected final String weigth;

    public Food(String name, String weigth) {
        this.name = name;
        this.weigth = weigth;
    }

    abstract void prepare();
}
