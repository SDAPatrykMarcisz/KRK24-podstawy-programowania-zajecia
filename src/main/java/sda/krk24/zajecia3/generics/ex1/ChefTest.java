package sda.krk24.zajecia3.generics.ex1;

public class ChefTest {
    public static void main(String[] args) {
        Chef<Beef> beefChef = new Chef<>();
        Chef<Nudle> nudleChef = new Chef<>();
        Chef<Cabbage> cabbageChef = new Chef<>();

        beefChef.prepareMeal(new Beef("beef", "500"));
//        beefChef.prepareMeal(new Nudle("makaron", "500")); //blad kompilacji

        Chef<Food> masterChef = new Chef<>();
        masterChef.prepareMeal(new Nudle("makaron", "500"));
        masterChef.prepareMeal(new Beef("beef", "500"));
        masterChef.prepareMeal(new Cabbage("cabbage", "500"));

    }
}
