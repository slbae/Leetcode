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
     * to innermost layers of the square matrix) in-place.
     * 
     * Time Complexity: O(n^2) bc matrix is NxN
     * 
     * Space Complexity: O(1) no additional space is needed bc we are operating in-place
     * 
     * Logic: The pattern of swapping is matrix[i][j] to matrix[j][n-i-1] (switch rows to cols then reverse col order).
     *  `     Rotating 90 degrees means swapping P1 -> P2, P2 -> P3, P3 -> P4, P4 -> P1 (positions of corners in clockwise order starting from top left).
     *        Identify positions we have to move by their 2D indices in matrix.
     * `      Move elements starting from P4 (counterclockwise) and make one temp to ensure we don't overwrite anything.
     * 
     * Date: 12/29/2024
     */
    public static int[][] rotateMatrix1(int[][] matrix) {
        int n = matrix.length;
    
        // Consider all layers of the matrix one square at a time.
        // Outermost layer i = 0, innermost layer i = n / 2.
        for (int i = 0; i < n / 2; i++) {
            int start = i;
            int end = n - i - 1;
            // Iterate over each element in the current layer
            for (int j = start; j < end; j++) {
                // The distance between the current column (j) and the starting index of the layer (start)
                // To adjust the points for each layer
                int offset = j - start;
    
                // Save top element (P1)
                int temp = matrix[start][j];
    
                // Move left element (P4) to top (P1)
                matrix[start][j] = matrix[end - offset][start];
    
                // Move bottom element (P3) to left (P4)
                matrix[end - offset][start] = matrix[end][end - offset];
    
                // Move right element (P2) to bottom (P3)
                matrix[end][end - offset] = matrix[j][end];
    
                // Assign temp (P1) to right (P2)
                matrix[j][end] = temp;
            }
        }
        return matrix;
    }
    
}
