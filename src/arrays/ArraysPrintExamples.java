package arrays;
import java.util.Arrays;

public class ArraysPrintExamples {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // 1. For Loop
        System.out.println("Using for loop:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // 2. Enhanced For Loop (For-Each Loop)
        System.out.println("Using enhanced for loop (for-each):");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 3. Arrays.toString() Method
        System.out.println("Using Arrays.toString() method:");
        System.out.println(Arrays.toString(array));

        // 4. Java Streams
        System.out.println("Using Java Streams:");
        Arrays.stream(array).forEach(element -> System.out.print(element + " "));
        System.out.println();

        // 5. Java 8+ String.join() Method
        System.out.println("Using Java 8+ String.join() method:");
        System.out.println(String.join(" ", Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new)));
    }
}