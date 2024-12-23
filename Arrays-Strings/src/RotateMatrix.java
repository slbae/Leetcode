import java.util.*;

/**
 * Given an N X N matrix of ints, rotate the matrix by 90 degrees, in place.
 * 
 * 1 1 1
 * 2 2 2
 * 3 3 3
 *
 * Rotated 90 degrees: Swap Edges (top edge to right edge, right edge to bottom
 * edge,
 * bottom edge to left edge, and left edge to top edge).
 * 
 * 3 2 1
 * 3 2 1
 * 3 2 1
 * 
 */
public class RotateMatrix {

    /**
     * Approach 1: Swap pairs of elements from adjacent edges in layers (outermost
     * to innermost layers of the square matrix).
     * 
     * Time Complexity: O()
     * 
     * Space Complexity: O()
     * 
     * Logic: The pattern of swapping is matrix[i][j] to matrix[j][n-i-1]
     * 
     * 
     * Date: 12/23/2024
     */
    public static int[][] rotateMatrix1(int[][] matrix) {
        int n = matrix.length;

        // For each layer of the square matrix...
        for (int layer = 0; layer < n / 2; layer++) {
            int start = layer;
            int end = n - layer - 1;
            for (int i = start; i < end; i++) {

            }

        }
        return matrix;
    }

}
