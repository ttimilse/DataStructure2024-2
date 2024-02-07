package basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HappyNum {
    public static void main(String[] args) {
        Set<Integer> seen = new HashSet<>();
        int n = 19;

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            int tempN = n;  // Store the original value of n for the final check
            while (tempN > 0) {
                int temp = tempN % 10;
                sum = sum + temp * temp;
                tempN = tempN / 10;
            }
            n = sum;
        }

        if (n == 1) {
            System.out.println("It's a Happy Number!");
        } else {
            System.out.println("It's NOT a Happy Number!");
        }
    }
}