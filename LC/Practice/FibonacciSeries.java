package LC.Practice;

import java.net.Socket;
import java.security.SignedObject;

/*The Fibonacci series is a series of elements 
where the previous two elements are added to generate the next term.

it starts with 0 and 1 

mathematically represented in the function as 

f(n)=f(n-1)+f(n-2)

f(0) is 0 and f(1) is 1

*/

public class FibonacciSeries {

    //function to print n fibonacci Number
    //using recursivve way
    static void Fibonacci(int N) {
    int n1 = 0 , n2 =1;

    for(int i=0 ; i < N ; i++){
        //print number

        System.out.println(n1 + " ");

        //swap
        int n3 = n2+n1;
        n1 = n2;
        n2 = n3;
    }
    }

    //Fibo series using recursive way
    //recursively iterate from N to 1
    //Base case : if the value called recursively is less 
    //than 1 the function returns 1 

    static int fib(int n)
    {
        //base case
        if( n <= 1)
            return n;

        //recursive call
        return fib(n-1) + fib(n-2);
    }

    //driver code
    public static void main(String args[])
    {
        //given number N
        int N = 3;

        //print the first N numbers 
        for(int i = 0; i<N; i++){

            System.out.print(fib(i) + " ");

        }
    }


    //3> Fibonacci series using memoization
    //Above example its tme complexity is O(2^n)
    //which is reduced to O(n) using the memoization
    //because function computes each fibonacci number
    //only once and stores it in array

    public static void main(String[] args)
    {
        //number of terms to print 
        int n = 10 ;
        int[] memo = new int[n+1];
        for(int i =1; i <= n; i++ ){
            System.out.println(fibonacci(i, memo)+" ");
        }
    }

    public static int fibonacci(int n, int[] memo)
    {
        if(memo[n] != 0)
            return memo[n];
        if (n==1 || n==2)
            return 1;
        else {
            memo[n] = fibonacci(n-1, memo) + fibonacci(n-2 , memo);
            return memo[n];
        }
    }

}

//Fibonacci series using Dynamic Programming
/*
    Steps
    we can avoid the repeated work done in method 2
    by storing the fibonacci numbers calculated so far
    
    -create an array arr[] of size N.
    -initialize arr[0] = 0 , arr [1] = 1.
    -iterate over [2 , N ] and update the array as:
      arr[i] = arr[i-2]+arr[i-1]

    print the value of arr[N].
 */

class green
{
    static int fib(int n)
    {
        //1 extra to handle case , n = 0
        int f[] = new int[n+2];

        int i;

        // 0th and 1st number of the series are 0 and 1
        f[0] = 0;
        f[1] = 1;

        for(i = 2 ; i <= n ; i++) {

            //add the previous 2 numbers
            // in the series and store it
            f[i] = f[i-1] + f[i-2];
        }

        //Nth Fibonacci Number
        return f[n];
    }

    public static void main(String args[])
    {
        int N = 10;

        for(int i =0 ; i < N ; i++)
            System.out.print(fib(i) + " ");
    }
}