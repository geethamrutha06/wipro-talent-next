import java.util.*;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("madam","hello","racecar","java",
                        "level","apple","rotor","book","noon","cat"));

        Predicate<String> palindrome = str ->
                str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());

        System.out.println("Palindrome Words:");

        words.stream()
                .filter(palindrome)
                .forEach(System.out::println);
    }
}