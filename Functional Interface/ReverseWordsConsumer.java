import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "apple", "banana", "cat", "dog", "java",
                "wipro", "hello", "world", "computer", "mobile"));

        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String rev = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, rev);
            }
        };

        reverseWords.accept(words);

        System.out.println("Reversed Words:");
        words.forEach(System.out::println);
    }
}