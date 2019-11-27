package sda.krk24.zajecia3.classes;

import java.util.Comparator;

public class Anonymous {

    public void someMethod() {
        Comparator<String> greeting = new Comparator<>() {
            @Override
            public int compare(String s, String t1) {
                return 0;
            }
        };


    }

}
