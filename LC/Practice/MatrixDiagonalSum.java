package LC.Practice;

/*
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and 
all the elements on the secondary diagonal that are not part of the primary diagonal.
 */

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat){
        int rows = mat.length;
        int col = mat[0].length;

        int i = 0 , j = col -1 , count = 0;

        for(int k = 0 ; k < rows ; k++){
            if (i == j)
                count += mat[k][j];
            else
                count += mat[k][i] + mat[k][j];
            i++;
            j--;
        }

        return count;
    }

    /*
    Specifically, for a square matrix, the diagonal elements have
     row and column indices of the form (i, i) or (i, n - i - 1).
    Therefore, we can iterate over each row of the matrix, and add 
    the diagonal elements to a running sum.
     */

    public int diagonalSum2(int[][] mat){
        int n = mat.length;
        int result = 0 ;

        for(int i = 0 ; i < n ; i++){
            result += mat[i][i] + mat[i][n-i-1];
        }

        if(n % 2 == 1){
            result -= mat[n/2][n/2];
        }
        return result;
    }
    
}
