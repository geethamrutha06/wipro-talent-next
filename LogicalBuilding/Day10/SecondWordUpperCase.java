import java.util.Scanner;

public class SecondWordUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        if (words.length >= 2) {
            System.out.println(words[1].toUpperCase());
        } else {
            System.out.println("Second word not found");
        }

        sc.close();
    }
}