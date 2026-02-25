/*
Problem Description
You are given an array of N non-negative integers 
where each represents the height of a line. N vertical
 lines are drawn at points marked 1 to n on the x axis
  as shown in the diagram. Find two lines, which 
  together with the x axis forms a container, such
   that the container holds the most water. Assume the 
   width of lines to be negligible.

Note: You may not slant the container and n is at
 least 2.

*/




public class largestContainer {

    public int maxArea(int[] height){
        int answer = 0;

        //set left as 0 and right as n-1
        int left = 0 , right = height.length-1;

        //run the loop till left < right
        while(left < right){
            //set area = min(height[left] , height[right]) * (right - left)
            int area = Math.min(height[left] , height[right]) * (right - left);

            //set answer as max(answer , area);
            answer = Math.max(answer , area);

            if(height[left] < height[right])
                left++;
            else
                right--;

        }
        return answer;
    }
    
}
