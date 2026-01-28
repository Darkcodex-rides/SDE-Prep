package LC.Practice;

/*The Fibonacci series is a series of elements 
where the previous two elements are added to generate the next term.

It starts with 0 and 1 

Mathematically represented as:

f(n) = f(n-1) + f(n-2)

f(0) = 0 and f(1) = 1
*/

public class FibonacciSeries {

    // ============================
    // DRIVER CODE
    // ============================

    public static void main(String[] args) {

        System.out.println("Iterative Method:");
        IterativeFibonacci.printFibonacci(5);

        System.out.println("\nRecursive Method:");
        for (int i = 0; i < 5; i++) {
            System.out.print(RecursiveFibonacci.fib(i) + " ");
        }

        System.out.println("\n\nMemoization Method:");
        int n = 10;
        int[] memo = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            System.out.print(MemoizationFibonacci.fibonacci(i, memo) + " ");
        }

        System.out.println("\n\nDynamic Programming Method:");
        for (int i = 0; i < 10; i++) {
            System.out.print(DPFibonacci.fib(i) + " ");
        }
    }
}

/* =========================================================
   Fibonacci series using Iterative Approach
   Time Complexity: O(n)
   Space Complexity: O(1)
   ========================================================= */

class IterativeFibonacci {

    // function to print n Fibonacci numbers
    public static void printFibonacci(int N) {

        int n1 = 0, n2 = 1;

        for (int i = 0; i < N; i++) {

            // print number
            System.out.print(n1 + " ");

            // generate next number
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}

/* =========================================================
   Fibonacci series using Recursive Approach
   Time Complexity: O(2^n)
   Space Complexity: O(n) (call stack)
   ========================================================= */

class RecursiveFibonacci {

    static int fib(int n) {

        // base case
        if (n <= 1)
            return n;

        // recursive call
        return fib(n - 1) + fib(n - 2);
    }
}

/* =========================================================
   Fibonacci series using Memoization
   Optimized recursion
   Time Complexity: O(n)
   Space Complexity: O(n)
   ========================================================= */

class MemoizationFibonacci {

    static int fibonacci(int n, int[] memo) {

        if (memo[n] != 0)
            return memo[n];

        if (n == 1 || n == 2)
            return 1;

        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }
}

/* =========================================================
   Fibonacci series using Dynamic Programming (Tabulation)
   
   Steps:
   - create an array arr[] of size N
   - initialize arr[0] = 0 , arr[1] = 1
   - iterate from 2 to N
   - arr[i] = arr[i-1] + arr[i-2]
   - final answer is arr[N]
   ========================================================= */

class DPFibonacci {

    static int fib(int n) {

        // extra space to handle case when n = 0
        int[] f = new int[n + 2];

        // first two Fibonacci numbers
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {

            // store sum of previous two numbers
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }
}
