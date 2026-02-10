package LC.Practice;

public class LargestWordLength {

    public static void main(String[] args) {

        String s = "My name is sourabh";
        String[] arr = s.split(" ");

        int ans = 0;

        for (String word : arr) {
            ans = Math.max(ans, word.length());
        }

        System.out.println(ans);
    }
}
