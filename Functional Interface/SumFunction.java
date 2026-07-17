import java.util.*;
import java.util.function.Function;

public class SumFunction {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(10,20,30,40,50,60,70,80,90,100));

        Function<ArrayList<Integer>, Integer> sum =
                list -> list.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum = " + sum.apply(numbers));
    }
}