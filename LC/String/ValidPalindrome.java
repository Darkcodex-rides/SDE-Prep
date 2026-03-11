package LC.String;

public class ValidPalindrome {

    // First way (Two pointer without modifying string)
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int last = s.length() - 1;

        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);

            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } 
            else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } 
            else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    // Second way (Using regex + cleaned string)
    public boolean isPalindrome2(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
| Method              | Time | Space |
| ------------------- | ---- | ----- |
| First (Two Pointer) | O(n) | O(1)  |
| Second (Regex)      | O(n) | O(n)  |



[^a-zA-Z0-9] is a regular expression pattern that 
matches any single character except for those in 
the range a-z, A-Z, or 0-9. In other words, it 
matches all characters except alphabets and numbers.
 */