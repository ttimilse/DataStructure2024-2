package arrays;

import java.util.Arrays;

public class RemoveArray {
    public static void main(String[] args) {

        // Original array
        int[] array = {1, 2, 3, 4, 5};
        int elementToRemove = 3;

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Find index of element to remove
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        // Remove element if found
        if (indexToRemove != -1) {
            // Shift elements to the left starting from indexToRemove
            for (int i = indexToRemove; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Resize the array by copying elements to a new array
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, newArray.length);

            // Update original array with the new array
            array = newArray;

            // Print updated array
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
