/*
  Write a program to find the peaks in the sequence.

An element is a peak element if it is greater than its neighbors (a[i] > a[i-1] AND a[i] > a[i+1]).
For the leftmost element, only check the element to the right of it (a[0] > a[1]). Similarly, 
for the rightmost element, only check the element to the left of it (a[n-1] > a[n-2]).

Below is an example, Input: Arr[] = [10,5,6,3,4,8,9,15] Output: [10,6,15]
*/

import java.io.*;
import java.util.*;


public class FindLocalPeakDSA {
     public static List<Integer> findLocalPeak(int N, int[] arr) {
        List<Integer> ans = new ArrayList<>();

        // first element
        if (N > 1 && arr[0] > arr[1]) {
            ans.add(arr[0]);
        }

        // middle elements
        for (int i = 1; i < N - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                ans.add(arr[i]);
            }
        }

        // last element
        if (N > 1 && arr[N - 1] > arr[N - 2]) {
            ans.add(arr[N - 1]);
        }

        return ans;
     }

     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> ans = findLocalPeak(N, arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}