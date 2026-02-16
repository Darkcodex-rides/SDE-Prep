package LC.Arrays;

import java.util.HashMap;
import java.util.Map;


public class TwoSumHash {

    //Simple implementation with two iterations
    //1st iteration -> elementts value as key && index as value
    //2nditeration -> comp = target - nums[i]
    // if com exists return current elements index and its comp index

    public int[] TwoSum(int [] nums , int target){
        //TC=O(n)
        Map<Integer , Integer> map = new HashMap<>();
        for(int i =0 ; i < nums.length; i++) {
            map.put(nums[i] , i);
        }

        for(int i =0 ; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i , map.get(complement)};
            }
        }
        //In case there is no solution , return an empty array

        return new int[] {};

    }

    //one pass
    //Tc-O(n)
    public int[] twoSum(int[] nums , int target){
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        //return an empty array if no solution is found
        return new int[] {};
    }
    
}
