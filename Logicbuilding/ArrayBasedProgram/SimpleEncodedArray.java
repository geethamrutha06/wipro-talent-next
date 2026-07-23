import java.util.Scanner;

public class SimpleEncodedArray {

    public static int encodeArray(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += Math.abs(arr[i] - arr[(i + 1) % arr.length]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(encodeArray(arr));
        sc.close();
    }
} 
    

