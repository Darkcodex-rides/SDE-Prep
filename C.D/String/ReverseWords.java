/*
A word is defined as a sequence of non-space characters. The words in s will be 
separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words.
Do not include any extra spaces.

Sample Input 1
hello world

Sample Output 1
world hello
*/

package String;

public class ReverseWords {

    static String reverseWordsInAString(String s){
        String res = "";
        int n = s.length();

        for(int i = n - 1; i >= -1; i--){
            if(i != -1 && s.charAt(i) != ' '){
                continue;
            }

            int count = 0;

            for(int j = i + 1; j < n && s.charAt(j) != ' '; j++){
                res += s.charAt(j);
                count++;
            }

            if(count > 0 && i != -1){
                res += ' ';
            }
        }
        return res.trim();
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(reverseWordsInAString(input));
    }
}