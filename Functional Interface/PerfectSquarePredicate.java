import java.util.*;
import java.util.function.Predicate;

public class PerfectSquarePredicate {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(0,1,2,3,4,5,9,10,16,18));

        Predicate<Integer> perfectSquare = num -> {
            int root = (int)Math.sqrt(num);
            return root * root == num;
        };

        System.out.println("Perfect Square Numbers:");

        numbers.stream()
                .filter(perfectSquare)
                .forEach(System.out::println);
    }
}