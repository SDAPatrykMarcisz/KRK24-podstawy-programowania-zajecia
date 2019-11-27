package sda.krk24.zajecia1.exception.enums;

import java.util.Arrays;

public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static void main(String[] args) {
        System.out.println(WeekDay.SUNDAY.toString());
        System.out.println(WeekDay.SUNDAY);
        System.out.println(WeekDay.values());
        System.out.println(Arrays.toString(WeekDay.values()));
    }
}
