package sda.krk24.zajecia1.exception.enums;

public enum Month {
    JANUARY("Styczen", 1),
    FEBRUARY("Luty", 2),
    MARCH("Marzec", 3);

    private String monthName;
    private int monthNumber;

    public String getMonthName() {
        return monthName;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    Month(String monthNameValue, int monthNumber) {
        monthName = monthNameValue;
        this.monthNumber = monthNumber;
    }

    public static Month getMonthBy(int monthNumber){
        for(Month month : Month.values()){
            if(month.getMonthNumber() == monthNumber){
                return month;
            }
        }
        throw new UnsupportedOperationException("cannot parse");
    }

    public static void main(String[] args) {
        Month monthBy = Month.getMonthBy(2);
        System.out.println(monthBy.monthName);
    }
}
