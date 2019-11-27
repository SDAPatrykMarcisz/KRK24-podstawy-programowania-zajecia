package sda.krk24.zajecia3.generics.ex2;

public class Triple<FIRST_TYPE, SECOND_TYPE, THIRD_TYPE> {
    private FIRST_TYPE firstValue;
    private SECOND_TYPE secondValue;
    private THIRD_TYPE thirdValue;

    public Triple(FIRST_TYPE firstValue, SECOND_TYPE secondValue, THIRD_TYPE thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public FIRST_TYPE getFirstValue() {
        return firstValue;
    }

    public SECOND_TYPE getSecondValue() {
        return secondValue;
    }

    public THIRD_TYPE getThirdValue() {
        return thirdValue;
    }
}
