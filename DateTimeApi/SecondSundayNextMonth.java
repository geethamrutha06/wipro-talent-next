import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondSundayNextMonth {

    public static void main(String[] args) {

        LocalDate secondSunday = LocalDate.now()
                .plusMonths(1)
                .withDayOfMonth(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY))
                .plusWeeks(1);

        System.out.println("Second Sunday of Next Month : " + secondSunday);
    }
}