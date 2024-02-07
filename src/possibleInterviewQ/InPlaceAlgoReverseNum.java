package possibleInterviewQ;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InPlaceAlgoReverseNum {
    public static int[] reverseInPlace(int[] A) {
        int n = A.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = A[i];
            A[i] = A[n - 1 - i];
            A[n - 1 - i] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};
        System.out.println("before sorting: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(reverseInPlace(arr)));
    }

}

