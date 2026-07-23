import java.io.*;
import java.util.*;

// Read only region start
class SumOfDigits{
    public int sumOfSumsOfDigits(int input1){
        // Read only region end
        // Write code here...
        String str = String.valueOf(input1);
        int totalSum = 0;

        // Iterate starting from each digit position
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                totalSum += str.charAt(j) - '0';
            }
        }

        return totalSum;
    }
}