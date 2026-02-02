package LC.Arrays;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    /* 
    Time complexity: O(n^2)
    Space complexity: O(n)
    Depends on language you use. In python, sorting algorithm use Timsort which uses O(n) space. 
    */

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return res;        
    }

/*  ---------------------------   */
    /*Optimized */

    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>lst=new ArrayList<>();
        HashSet<List<Integer>>set=new HashSet<>();
    
        
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            
            
            int left=i+1,right=nums.length-1;
            while(left<right){
                List<Integer>subset=new ArrayList<>();
                if(nums[i]+nums[left]+nums[right]==0){
                    subset.add(nums[i]);
                    subset.add(nums[left]);
                    subset.add(nums[right]);
                    set.add(subset);
                    
                    left++;
                    right--;

                }
                if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
                if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }


            }
              
        }
        for(List<Integer> values:set){
            lst.add(values);
        }
        return lst;
    }
}

}
