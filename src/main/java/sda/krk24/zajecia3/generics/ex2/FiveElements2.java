package sda.krk24.zajecia3.generics.ex2;

import java.util.Objects;

public class FiveElements2<FIRST_TYPE, SECOND_TYPE, THIRD_TYPE, FOURTH_TYPE, FIFTH_TYPE> {

    private final Pair<FIRST_TYPE, SECOND_TYPE> pair;
    private final Triple<THIRD_TYPE, FOURTH_TYPE, FIFTH_TYPE> triple;

    public FiveElements2(
            FIRST_TYPE firstType,
            SECOND_TYPE secondType,
            THIRD_TYPE thirdType,
            FOURTH_TYPE fourthType,
            FIFTH_TYPE fifth_type) {

        if (Objects.isNull(firstType) ||  //firstType != null;
                Objects.isNull(secondType) ||
                Objects.isNull(thirdType) ||
                Objects.isNull(fourthType) ||
                Objects.isNull(fifth_type)) {
            throw new IllegalArgumentException();
        }

        this.pair = new Pair<>(firstType, secondType);
        this.triple = new Triple<>(thirdType, fourthType, fifth_type);
    }

    public FIRST_TYPE getFirstValue() {
        return pair.getFirstValue();
    }

    public SECOND_TYPE getSecondValue() {
        return pair.getSecondValue();
    }

    public THIRD_TYPE getThirdValue() {
        return triple.getFirstValue();
    }

    public FOURTH_TYPE getFourthType() {
        return triple.getSecondValue();
    }

    public FIFTH_TYPE getFith() {
        return triple.getThirdValue();
    }
}
