import java.time.LocalTime;

public class TimeBeforeFiveHoursThirtyMinutes {

    public static void main(String[] args) {

        LocalTime current = LocalTime.now();
        LocalTime beforeTime = current.minusHours(5).minusMinutes(30);

        System.out.println("Current Time : " + current);
        System.out.println("5 Hours 30 Minutes Before : " + beforeTime);
    }
}