package sda.krk24.zajecia2.collections.set;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(); //Comparator.reverseOrder()
        numbers.add(5);
        numbers.add(1);
        for(int i : numbers){
            System.out.println(i);
        }
        numbers.remove(1);
        for(int i : numbers) {
            System.out.println(i);
        }

        Set<ClassToKeepInSet> customSet = new TreeSet<>();
//        Set<ClassToKeepInSet> customSet = new TreeSet<>(new Comparator<ClassToKeepInSet>() {
//            @Override
//            public int compare(ClassToKeepInSet o1, ClassToKeepInSet o2) {
//                return Integer.compare(o1.intValue, o2.intValue);
//            }
//        });
        customSet.add(new ClassToKeepInSet(1, "z"));
        customSet.add(new ClassToKeepInSet(2, "y"));
        for(ClassToKeepInSet element : customSet) {
            System.out.println(element);
        }

        ClassToKeepInSet[] customTable = new ClassToKeepInSet[customSet.size()];
        Iterator<ClassToKeepInSet> iterator = customSet.iterator();
        int i = 0;
        while(iterator.hasNext()){
            ClassToKeepInSet next = iterator.next();
            customTable[i] = next;
            i++;
        }
        System.out.println(Arrays.asList(customTable));

        ClassToKeepInSet[] customTable2 = new ClassToKeepInSet[customSet.size()];
        customSet.toArray(customTable2);
        ClassToKeepInSet[] classToKeepInSets = customSet.toArray(new ClassToKeepInSet[0]);
        System.out.println(Arrays.asList(customTable2));


    }
}

class ClassToKeepInSet implements Comparable<ClassToKeepInSet>{

    int intValue;
    String stringValue;

    public ClassToKeepInSet(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    @Override
    public int compareTo(@NotNull ClassToKeepInSet classToKeepInSet) {
        if(intValue < classToKeepInSet.intValue){
            return -1;
        } else if (intValue > classToKeepInSet.intValue){
            return 1;
        } else {
            return 0;
        }
        //return Integer.compare(intValue, classToKeepInSet.intValue);
    }

    @Override
    public String toString() {
        return "ClassToKeepInSet{" +
                "intValue=" + intValue +
                ", stringValue='" + stringValue + '\'' +
                '}';
    }
}
