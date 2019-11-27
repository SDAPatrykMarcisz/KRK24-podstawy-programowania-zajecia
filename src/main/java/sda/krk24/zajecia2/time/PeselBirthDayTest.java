package sda.krk24.zajecia2.time;

public class PeselBirthDayTest {
    public static void main(String[] args) {
        Pesel pesel = new Pesel("92112629363");
        System.out.println(pesel.convertToLocalTime());

        pesel = new Pesel("92212629363");
        System.out.println(pesel.convertToLocalTime());

        pesel = new Pesel("11652629363");
        System.out.println(pesel.convertToLocalTime());
    }
}
