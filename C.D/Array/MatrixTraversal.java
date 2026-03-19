import java.util.*;
/*
A matrix and a valid current position (row number and column number) are provided as input.
Given a direction (RIGHT is 1, DOWN in 2, LEFT is 3 and UP is 4) and number of steps to move, 
output the values along the path taken to the new position, including the value at the new position.

If any position during traversal is out of bounds, output [-1] (array with single element -1) and 
not the values along the path.
*/
public class MatrixTraversal {

    public static List<Integer> matrixTraversal(int[][] matrix, int currPosRow, int currPosCol, int dirToMove, int stepsToMove) {

        List<Integer> res = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int row = currPosRow;
        int col = currPosCol;

        // Direction vectors: RIGHT, DOWN, LEFT, UP
        int[][] dirs = {
            {0, 1},   // RIGHT (1)
            {1, 0},   // DOWN  (2)
            {0, -1},  // LEFT  (3)
            {-1, 0}   // UP    (4)
        };

        // Invalid direction check
        if (dirToMove < 1 || dirToMove > 4) {
            res.add(-1);
            return res;
        }

        int dRow = dirs[dirToMove - 1][0];
        int dCol = dirs[dirToMove - 1][1];

        // Move step-by-step
        for (int i = 0; i < stepsToMove; i++) {
            row += dRow;
            col += dCol;

            // Boundary check
            if (row < 0 || row >= m || col < 0 || col >= n) {
                res.clear();
                res.add(-1);
                return res;
            }

            res.add(matrix[row][col]);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input M and N
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matrix = new int[M][N];

        // Input matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Current position
        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Direction and steps
        int A = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> result = matrixTraversal(matrix, X, Y, A, B);

        // Print result
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}