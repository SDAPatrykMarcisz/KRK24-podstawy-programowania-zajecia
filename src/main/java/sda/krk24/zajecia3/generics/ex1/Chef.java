package sda.krk24.zajecia3.generics.ex1;

public class Chef <T extends Food> {

    void prepareMeal(T foodToPrepare){
        foodToPrepare.prepare();
    }

}
