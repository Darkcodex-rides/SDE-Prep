package Array;
import java.util.*;
/*
Given a matrix of dimension nxn having elements 1 to nxn distinct elements. 
Check whether the matrix is magic square or not.
Magic square is a square that has the same sum of rows, columns and diagonals.
*/
public class CheckMagicSquare {

    // Method to check Magic Square
    static String checkMagicSquare(int n, int[][] grid) {
        int pdsum = 0;
        int sdsum = 0;

        // Diagonal sums
        //primary diagonal -> row==col
        //secondary diagonal->col=n-1-row
        for (int row = 0; row < n; row++) {
            pdsum += grid[row][row];
            sdsum += grid[row][n - 1 - row];
        }

        // Check diagonals
        if (pdsum != sdsum) {
            return "No";
        }

        int rowsum;
        int colsum;

        // Check rows & columns
        for (int row = 0; row < n; row++) {
            rowsum = 0;
            colsum = 0;

            for (int col = 0; col < n; col++) {
                rowsum += grid[row][col];
                colsum += grid[col][row];
            }

            // ❗ Fix here: compare both with pdsum
            if (rowsum != pdsum || colsum != pdsum) {
                return "No";
            }
        }

        return "Yes";
    }

    // Optional main method (for testing)
    public static void main(String[] args) {
        int[][] grid = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        System.out.println(checkMagicSquare(3, grid)); // Output: Yes
    }
}