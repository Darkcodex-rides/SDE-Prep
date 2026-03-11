package LC.String;

// Iterative approach to reverse a character array in-place
public class ReverseString {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        // Two-pointer technique: swap characters from both ends moving inward
        while (left < right) {
            // Swap the characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers toward the center
            left++;
            right--;
        }
    }
}

// Recursive approach to reverse a character array in-place
class Solution {

    // Helper method that recursively swaps characters from both ends
    public static void reverseStringHelper(char[] s, int start, int end) {
        // Base case: when pointers meet or cross, reversal is complete
        if (start > end) {
            return;
        }

        // Swap characters at the current start and end positions
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        // Recursive call moving both pointers inward
        reverseStringHelper(s, start + 1, end - 1);
    }

    public void reverseString(char[] s) {
        // Initiate recursion with full array bounds
        reverseStringHelper(s, 0, s.length - 1);
    }
}