/*
Given a sorted array of N distinct integers and a target value X, 
return the index if the target is found. If not found then return -1.

Note - Try implementing with O(logN) runtime complexity
(Binary Search)
*/

public class SearchTarget {

    static int searchTarget(int N, int A[], int X) {
        // initialization of two pointers
        int left = 0, right = N - 1;

        // binary search loop
        while (left <= right) {
            // avoid overflow (important improvement)
            int mid = left + (right - left) / 2;

            // check if target found
            if (A[mid] == X) {
                return mid;
            } 
            else if (A[mid] < X) {
                // move right
                left = mid + 1;
            } 
            else {
                // move left
                right = mid - 1;
            }
        }

        // target not found
        return -1;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;

        int result = searchTarget(arr.length, arr, target);
        System.out.println(result); // Output: 3
    }
}