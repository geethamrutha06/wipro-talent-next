import java.time.LocalTime;

public class TimeAfter25Minutes {

    public static void main(String[] args) {

        LocalTime current = LocalTime.now();
        LocalTime after25 = current.plusMinutes(25);

        System.out.println("Current Time : " + current);
        System.out.println("After 25 Minutes : " + after25);
    }
}