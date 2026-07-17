import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(2, 5, 8, 11, 14, 17, 20, 25, 30, 33));

        Consumer<Integer> check = num -> {
            if (num % 2 == 0)
                System.out.println(num + " even");
            else
                System.out.println(num + " odd");
        };

        numbers.forEach(check);
    }
}