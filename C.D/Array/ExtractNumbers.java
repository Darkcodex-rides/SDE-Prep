package Array;
import java.util.*;

public class ExtractNumbers {

    public static List<Integer> extractNumbers(int N, List<String> arr) {

        List<Integer> ans = new ArrayList<>();

        for (String element : arr) {
            try {
                // convert string to number
                int num = Integer.parseInt(element);
                ans.add(num);
            } 
            catch (NumberFormatException e) {
                // ignore if string is not a number
            }
        }

        return ans;
    }
}