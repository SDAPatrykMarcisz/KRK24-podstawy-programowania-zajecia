package sda.krk24.zajecia3.classes;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculatorInterfaceTest {

    public static void main(String[] args) {

        CalculatorInterface dodawanie = (x, y) -> x + y;
        CalculatorInterface dodawanie2 = (Double x, Double y) -> {
            return x+y;
        };
        CalculatorInterface dodawanie3 = (double1, double2) -> double1 + double2;
        CalculatorInterface dodawanie4 = Double::sum;

        CalculatorInterface odejmowanie = new CalculatorInterface() {
            @Override
            public Double operacjaMatematyczna(Double x, Double y) {
                return x - y;
            }
        };

        CalculatorInterface odejmowanie2 = (x, y) -> x - y;

        Set<Integer> collect = Stream.of("2", "12", "312")
                .map(x -> x.toUpperCase())
                .map(x -> Integer.parseInt(x))
                .filter(x -> x > 2)
                .collect(Collectors.toSet());

        System.out.println(collect);

        // <Klasa bez nazwy> implements CalculatorInterface{
//        @Override
//        public Double operacjaMatematyczna(Double x, Double y) {
//            return x - y;

        //}
        //
        // Calulator odejmowanie = new <Klasa bez nazwy>();

        double x = 5;
        double y = 10;
        Double aDouble = odejmowanie.operacjaMatematyczna(y, x);
        Double aDouble1 = dodawanie.operacjaMatematyczna(x, y);
        System.out.println(aDouble + " : " + aDouble1);
    }
}
