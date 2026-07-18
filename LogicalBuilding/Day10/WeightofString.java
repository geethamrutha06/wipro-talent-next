import java.util.Scanner;

public class WeightofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toUpperCase();

        int weight = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                weight += ch - 'A' + 1;
            }
        }

        System.out.println("Weight = " + weight);

        sc.close();
    }
}