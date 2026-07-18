import java.util.Scanner;

public class DigitSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter choice (E for Even, O for Odd): ");
        char choice = sc.next().charAt(0);

        n = Math.abs(n);

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if ((choice == 'E' || choice == 'e') && digit % 2 == 0) {
                sum += digit;
            } else if ((choice == 'O' || choice == 'o') && digit % 2 != 0) {
                sum += digit;
            }

            n /= 10;
        }

        System.out.println("Required sum = " + sum);

        sc.close();
    }
}