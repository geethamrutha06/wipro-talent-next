import java.util.Scanner;

public class MostFrequentlyOccurringDigit {

    public static int mostFrequentDigit(int[] arr) {

        int[] freq = new int[10];

        for (int num : arr) {

            num = Math.abs(num);

            if (num == 0)
                freq[0]++;

            while (num > 0) {
                freq[num % 10]++;
                num /= 10;
            }
        }

        int max = freq[0];
        int digit = 0;

        for (int i = 1; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }

        return digit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(mostFrequentDigit(arr));
        sc.close();
    }
}