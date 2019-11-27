package sda.krk24.zajecia3.generics.ex2;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("StringValue", 5);
        String firstValue = pair.getFirstValue();
        Integer secondValue = pair.getSecondValue();
        System.out.println(firstValue + " : " + secondValue);
    }
}
