import java.util.Scanner;

public class DecreasingSequence {

    public static boolean isDecreasing(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        if (isDecreasing(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}