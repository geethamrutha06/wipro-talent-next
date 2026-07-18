import java.util.Scanner;

public class MostFrequentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        int[] freq = new int[10];

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            freq[digit]++;
        }

        int maxFreq = 0;
        int digit = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                digit = i;
            }
        }

        System.out.println("Most Frequent Digit = " + digit);

        sc.close();
    }
}
