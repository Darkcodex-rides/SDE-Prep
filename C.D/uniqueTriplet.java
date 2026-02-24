import java.util.Scanner;
import java.util.*;

class uniqueTriplet {

    public List<List<Integer>> ut(Integer[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0 ; i < n -2 ; i++){
            //skip duplicate elements for i
            if( i > 0 && nums[i].equals(nums[i-1])){
                continue;
            }

            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));

                    left++;
                    right--;

                    //skip duplicate for left
                    while(left < right && nums[left].equals(nums[left -1])){
                        left++;
                    }

                    //skip duplicate for right
                    while(left < right && nums[right].equals(nums[right+1])) {
                        right--;
                    }
                } else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Integer[] nums = new Integer[n];

        for(int i = 0 ; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        List<List<Integer>> result = new ut().ut(nums);

        for(List<Integer> triplet : result){
            System.out.printf("%d %d %d\n",
                    triplet.get(0), triplet.get(1), triplet.get(2));
        }
    }
}