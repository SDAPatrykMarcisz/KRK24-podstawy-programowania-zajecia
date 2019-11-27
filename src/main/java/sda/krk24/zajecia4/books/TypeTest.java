package sda.krk24.zajecia4.books;

import java.util.ArrayList;
import java.util.List;

public class TypeTest {
    public static void main(String[] args) {
        List<NaszEnum> types = new ArrayList<>();
        types.add(NaszEnum.A);
        types.add(NaszEnum.C);

        System.out.println(types);
    }
}
