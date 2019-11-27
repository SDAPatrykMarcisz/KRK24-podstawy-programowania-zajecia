package sda.krk24.zajecia3.generics.ex2;

public class FiveElements<FIRST_TYPE, SECOND_TYPE, THIRD_TYPE, FOURTH_TYPE, FIFTH_TYPE> {
    private final FIRST_TYPE firstValue;
    private final SECOND_TYPE secondValue;
    private final THIRD_TYPE thirdValue;
    private final FOURTH_TYPE fourth_type;
    private final FIFTH_TYPE fifth_type;


    public FiveElements(FIRST_TYPE firstValue, SECOND_TYPE secondValue, THIRD_TYPE thirdValue, FOURTH_TYPE fourth_type, FIFTH_TYPE fifth_type) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.fourth_type = fourth_type;
        this.fifth_type = fifth_type;
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

    public FOURTH_TYPE getFourth_type() {
        return fourth_type;
    }

    public FIFTH_TYPE getFifth_type() {
        return fifth_type;
    }
}
