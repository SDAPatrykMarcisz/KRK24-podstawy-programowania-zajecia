package sda.krk24.zajecia2.time;

import java.time.LocalDate;

public class Pesel implements Validatable {

    private final String pesel;
    private int[] factors = {1,3,7,9,1,3,7,9,1,3,1};

    public Pesel(String pesel) {
        this.pesel = pesel;
    }

    //1×a + 3×b + 7×c + 9×d + 1×e + 3×f + 7×g + 9×h + 1×i + 3×j + 1×k
    @Override
    public boolean isValid(){
        int sum = 0;
        for(int i = 0; i < factors.length; i++){
            int numericValue = Character.getNumericValue(pesel.charAt(i));
            int multiply = factors[i] * numericValue;
            sum += multiply; //sum = sum + multiply
        }
        return sum % 10 == 0;
    }

    public LocalDate convertToLocalTime(){
        String substring = pesel.substring(0, 6);
        int month = Integer.parseInt(pesel.substring(2, 4));
        int prefixYear = calculateCentury(month);
        int year = Integer.parseInt(pesel.substring(0, 2)) + prefixYear;
        month = month % 20;
        int day = Integer.parseInt(pesel.substring(4, 6));
        return LocalDate.of(year, month, day);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("");
    }

    private int calculateCentury(int month){
        int century =  month < 20
                ? 1900
                : month < 40
                    ? 2000
                    : month < 60
                        ? 2100
                        : month < 80
                            ? 1800
                            : -1;
        if(century == -1){
            throw new UnsupportedOperationException();
        }
        return century;

    }

    public String getPesel() {
        return pesel;
    }
}
