/*
Implement the function stringCompression() that:

Accepts a string s as an argument

Returns

a compressed string for each group of consecutive repeated characters by replacing
 the group with the character followed by the number of occurrences.

the original string if the compressed string is not shorter than the original string


Note
You can assume the string contains only uppercase and lowercase letters (a-z).

Sample Input 1
aabccccc


Sample Output 1
a2b1c5

*/

package String;

public class StringCompress {

    public static String compress(String s) {
        StringBuilder output = new StringBuilder();

        char ch = '#';   // initialize ch with #
        int freq = 0;    // initialize freq with 0

        for (int i = 0; i < s.length(); i++) {

            if (ch != s.charAt(i)) {

                if (ch != '#') {
                    output.append(ch);
                    output.append(freq);
                }

                ch = s.charAt(i);
                freq = 1;

            } else {
                freq++;
            }
        }

        // last group
        if (ch != '#') {
            output.append(ch);
            output.append(freq);
        }

        if (output.length() < s.length()) {
            return output.toString();
        }

        return s;
    }

    public static void main(String[] args) {
        String input = "aaabbcc";
        System.out.println(compress(input));
    }
}