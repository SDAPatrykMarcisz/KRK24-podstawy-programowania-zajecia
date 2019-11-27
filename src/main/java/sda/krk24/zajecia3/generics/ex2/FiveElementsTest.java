package sda.krk24.zajecia3.generics.ex2;

public class FiveElementsTest {
    public static void main(String[] args) {
        // String, Integer, Double, Float, Character
        Pair<Pair<String, Integer>, Triple<Double, Float, Character>> fiveElements =
                new Pair<>(
                        new Pair<>("StringValue", 5), //mozna przekazac null i pojdzie NPException
                        new Triple<>(40.0, 46.6f, 'z')
                );
        String firstValue = fiveElements.getFirstValue().getFirstValue();
        Integer intValue = fiveElements.getFirstValue().getSecondValue();
        Double doubleValue = fiveElements.getSecondValue().getFirstValue();
        Float floatValue = fiveElements.getSecondValue().getSecondValue();
        Character charValue = fiveElements.getSecondValue().getThirdValue();

        FiveElements2<String, String, String, String, String> fiveStrings
                = new FiveElements2<>("1", "2", "3", "4", "5");
//        FiveElementsTest.class.cast(new FiveElementsTest());
//        Number number = convertTo(String.class, 6);
    }

    public static <T, R extends T> T convertTo(Class<T> clazz, R toConvert) {
        return clazz.cast(toConvert);
    }

}
