import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RotateMatrixTest {
    @Test
    public void testRotateMatrix1_basicCase() {
        // 2x2 matrix
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        int[][] expected = {
            {3, 1},
            {4, 2}
        };
        assertArrayEquals(expected, RotateMatrix.rotateMatrix1(matrix));
    }

    @Test
    public void testRotateMatrix1_largerMatrix() {
        // 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] expected = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
        };
        assertArrayEquals(expected, RotateMatrix.rotateMatrix1(matrix));
    }

    @Test
    public void testRotateMatrix1_singleElement() {
        // 1x1 matrix
        int[][] matrix = {
            {1}
        };
        int[][] expected = {
            {1}
        };
        assertArrayEquals(expected, RotateMatrix.rotateMatrix1(matrix));
    }

    @Test
    public void testRotateMatrix1_emptyMatrix() {
        // Empty matrix
        int[][] matrix = {};
        int[][] expected = {};
        assertArrayEquals(expected, RotateMatrix.rotateMatrix1(matrix));
    }

    @Test
    public void testRotateMatrix1_negativeNumbers() {
        // Matrix with negative numbers
        int[][] matrix = {
            {-1, -2},
            {-3, -4}
        };
        int[][] expected = {
            {-3, -1},
            {-4, -2}
        };
        assertArrayEquals(expected, RotateMatrix.rotateMatrix1(matrix));
    }

    @Test
    public void testRotateMatrix1_fourByFour() {
        // 4x4 matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int[][] expected = {
            {13, 9, 5, 1},
            {14, 10, 6, 2},
            {15, 11, 7, 3},
            {16, 12, 8, 4}
        };
        assertArrayEquals(expected, RotateMatrix.rotateMatrix1(matrix));
    }
}
