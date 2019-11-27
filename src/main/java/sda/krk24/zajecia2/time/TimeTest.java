package sda.krk24.zajecia2.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTest {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'GODZINA:' HH:mm:ss");
        String timeAsString = now.format(formatter);
        System.out.println(timeAsString);

        LocalTime actualTimePlusHour = LocalTime.now().plusHours(1);
        boolean after = actualTimePlusHour.isAfter(LocalTime.now());
        System.out.println("is after? " + after);

        DateTimeFormatter readFromStringPattern = DateTimeFormatter.ofPattern("'GODZINA: 'HH:mm:ss");
        String toParse = "GODZINA: 22:13:15";
        LocalTime parsedTime = LocalTime.parse(toParse, readFromStringPattern);
        System.out.println(parsedTime);

        Duration between = Duration.between(now, parsedTime);

        LocalDateTime max = LocalDateTime.MAX;
        LocalDateTime anyLocalDate = LocalDateTime.of(2017, 11, 19,9, 35);
        LocalDateTime todayStart = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        System.out.println(todayStart);


    }

}
