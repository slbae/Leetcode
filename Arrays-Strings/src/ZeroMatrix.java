import java.util.*;

/**
 * If an element in an M x N matrix is 0, set its entire row and column to 0.
 */
public class ZeroMatrix {

    /**
     * Approach 1: Hashsets
     * 
     * Time Complexity: O(M X N) bc we are searching each element in the matrix
     * 
     * Space Complexity: O(M + N) bc in the worst case, the hashsets can store up to m and n elements
     * 
     * Logic: Search for zeros in the matrix and store the row and col indices in separate hashsets to avoid duplicates.
     *        Then, nullify the entire row and col for each row and col in the hashsets.
     * 
     * Date: 12/29/2024
     */
    public static int[][] zeroMatrix1(int[][] matrix) {
        // Base Case: Null or empty matrix
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        // Search each element
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Found a 0
                if (matrix[i][j] == 0) {
                    // Store the row and col of the 0 element
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        // If a 0 was found, set its entire row and col to 0
        for (int row : rows) {
            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }
            
        }
        for (int col : cols) {
            for (int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
            
        }

        // Return zeroed matrix
        return matrix;
    }
    
}
