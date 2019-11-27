package sda.krk24.zajecia3.generics.ex2;

public class Pair<FIRST_TYPE, SECOND_TYPE> {

    private final FIRST_TYPE firstValue;
    private final SECOND_TYPE secondValue;

    public Pair(FIRST_TYPE firstValue, SECOND_TYPE secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public FIRST_TYPE getFirstValue() {
        return firstValue;
    }

    public SECOND_TYPE getSecondValue() {
        return secondValue;
    }
}
