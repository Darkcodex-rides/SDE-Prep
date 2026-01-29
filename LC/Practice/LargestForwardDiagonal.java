package LC.Practice;

import java.util.*;

class LargestForwardDiagonal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> M = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                temp.add(sc.nextInt());
            }
            M.add(temp);
        }

        int result = largestForwardDiagonal(M);
        System.out.println(result);
        sc.close();
    }

    static int largestForwardDiagonal(ArrayList<ArrayList<Integer>> M) {

        int n = M.size();
        int m = M.get(0).size();

        int maxSum = Integer.MIN_VALUE;

        // Start from top row
        for (int col = 0; col < m; col++) {
            int i = 0, j = col, sum = 0;
            while (i < n && j < m) {
                sum += M.get(i).get(j);
                i++;
                j++;
            }
            maxSum = Math.max(maxSum, sum);
        }

        // Start from left column
        for (int row = 1; row < n; row++) {
            int i = row, j = 0, sum = 0;
            while (i < n && j < m) {
                sum += M.get(i).get(j);
                i++;
                j++;
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
