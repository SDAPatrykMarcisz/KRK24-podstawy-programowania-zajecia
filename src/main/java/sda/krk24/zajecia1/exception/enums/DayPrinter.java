package sda.krk24.zajecia1.exception.enums;

public class DayPrinter {
    String printByDay(WeekDay day) {
        switch (day) {
            case MONDAY:
                return "Loops";
            case TUESDAY:
                return "Arrays";
            case WEDNESDAY:
                return "Enums";
            case THURSDAY:
                return "Classes";
            case FRIDAY:
                return "Beer";
            case SATURDAY:
                return "REST";
            case SUNDAY:
                return "Java";
            default:
                return "null";
        }
    }
}

// dla MONDAY - "Loops"
// ◦ dla TUESDAY - "Arrays"
// ◦ dla WEDNESDAY - "Enums"
// ◦ dla THURSDAY - "Classes"
// ◦ dla FRIDAY - "Beer"
// ◦ dla SATURDAY - "REST"
// ◦ dla SUNDAY - "Java"
