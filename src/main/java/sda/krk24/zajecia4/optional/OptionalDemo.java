package sda.krk24.zajecia4.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo {
    public static void main(String[] args) {
        String wartosc = getStringOrNull(true);
        String wynikmetody = metodaOrElse(wartosc);
        System.out.println(wynikmetody);

        String wartoscNull = getStringOrNull(false);
        System.out.println(metodaOrElse(wartoscNull));
    }

    private static void  sposobyTworzeniaOptional(){
        Optional<String> optionalString = Optional.of("wartosc");
        //optional.of //rzuca wyjatkiem NPE jezeli dostanie nulla

        Optional<String> optionalString2 = Optional.ofNullable("wartosc");
        //optional.ofNullable nie rzuca NullPointerException jezeli jest null w parametrze

        Optional.empty(); //zawsze ma nulla w srodku
        //Optional.ofNullable(null)

    }

    private static String metodaOrElse(String string){
        Optional<String> optional = Optional.ofNullable(string);
        return optional.orElse("zwroc jezeli null");
    }

    private static Integer metodaOrElseDlaIntegera(Integer integer){
        Optional<Integer> optional = Optional.ofNullable(integer);
        return optional.orElse(-1);
    }

    private static void metodaOrThrow(Integer integer){
        Optional<Integer> optional = Optional.ofNullable(integer);
        optional.orElseThrow(); //to samo co get
        optional.orElseThrow(() -> new RuntimeException());

        Supplier<RuntimeException> integerSupplier = new Supplier<>() {
            @Override
            public RuntimeException get() {
                return new RuntimeException() ;
            }
        };

        //supplier
    }


    private static String getStringOrNull(boolean b) {
        return b ? "WYNIK" : null;
    }
}
