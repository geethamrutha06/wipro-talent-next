import java.time.LocalDate;
import java.time.Period;

public class WiproExperience {

    public static void main(String[] args) {

        // Change this joining date as needed
        LocalDate joiningDate = LocalDate.of(2023, 7, 15);

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience:");
        System.out.println(experience.getYears() + " Years "
                + experience.getMonths() + " Months "
                + experience.getDays() + " Days");
    }
}