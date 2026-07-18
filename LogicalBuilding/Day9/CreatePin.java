import java.util.Scanner;

public class CreatePin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alpha = sc.nextInt();
        int beta = sc.nextInt();
        int gamma = sc.nextInt();

        int smallest = Math.min(alpha, Math.min(beta, gamma));
        int largest = Math.max(alpha, Math.max(beta, gamma));

        int minDigit = 9;
        int maxDigit = 0;

        int[] arr = {alpha, beta, gamma};

        for (int num : arr) {
            while (num > 0) {
                int digit = num % 10;

                if (digit < minDigit)
                    minDigit = digit;

                if (digit > maxDigit)
                    maxDigit = digit;

                num /= 10;
            }
        }

        System.out.println("" + smallest + largest + minDigit + maxDigit);

        sc.close();
    }
}