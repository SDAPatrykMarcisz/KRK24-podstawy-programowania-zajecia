package sda.krk24.zajecia2.collections;

import java.util.*;

public class Utils {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(5,2,3,4,4,4,4,1);
//        ints.add(5); //exception
//        new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,4,4,4)); //mozna obejsc przez nowa liste
        List<Object> objects = Collections.emptyList();
        System.out.println(Collections.max(ints));
        System.out.println(Collections.min(ints));
        Collections.sort(ints);
        System.out.println(ints);
        ints.sort(Integer::compareTo);
        ints.sort(Comparator.reverseOrder());
        Collections.sort(ints, Comparator.reverseOrder());

        Comparator<Object> objectComparator = Collections.reverseOrder();
        Collections.reverse(ints);
//        Collections.singleton*
        Set<Integer> singleton = Collections.singleton(4);
        List<Integer> integers = Collections.singletonList(4);
        Map<Integer, String> cztery = Collections.singletonMap(4, "cztery");

        int frequency = Collections.frequency(ints, 4);
        System.out.println(frequency);
    }
}
