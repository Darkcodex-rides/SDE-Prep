public class FizzBuzz {
    /*
    Problem Description
Implement the function fizzBuzz() that:

Accepts a number argument n
Write a program that outputs the string representation of numbers from 1 to N,

For multiples of three, it should output "Fizz" instead of the number.

For multiples of five, output "Buzz" instead of the number.

For numbers that are multiples of both three and five, output "FizzBuzz".

For numbers that are multiples of neither three nor five, output the number itself as a string.

Write a program that outputs the string representation of numbers from 1 to N.
     */

    public static String [] fizzBuzz(int n)
    {
        String [] ans = new String[n];

        for(int i =1 ; i <= n ;i++){
            if(i%3 == 0 && i%5 == 0){
                ans[i-1] = "FizzBuzz";

            }
            else if(i%3 == 0){
                ans[i-1] = "Fizz";
            } else if(i%5 == 0){
                ans[i-1] = "Buzz";
            }else{
                ans[i-1] = i+"";
            }
        }
        return ans;
    }
}
