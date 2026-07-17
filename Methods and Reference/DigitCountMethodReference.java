interface DigitCount {
    int countDigits(int n);
}

class NumberUtil {

    public static int digitCount(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }

        return count;
    }
}

public class DigitCountMethodReference {

    public static void main(String[] args) {

        DigitCount dc = NumberUtil::digitCount;

        System.out.println("Number of Digits = " + dc.countDigits(987654));
    }
}