/*
You are given a array of numbers. Your task 
is to rotate the given array left(anti-clockwise) by
 1 units from the starting index. You are required to return the rotated array.

*/
package Array;
import java.util.*;

public class LeftRotation {

    static List<Integer> leftRotation(List<Integer> arr) {

        // Store first element
        int temp = arr.get(0);
        int n = arr.size();

        // Shift elements to the left
        for (int idx = 0; idx <= n - 2; idx++) {
            arr.set(idx, arr.get(idx + 1));
        }

        // Place first element at last position
        arr.set(n - 1, temp);

        return arr;
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original Array: " + arr);

        List<Integer> rotated = leftRotation(arr);

        System.out.println("Rotated Array: " + rotated);
    }
}