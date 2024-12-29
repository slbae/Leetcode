import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ZeroMatrixTest {

    @Test
    public void testZeroMatrix1_noZeros() {
        int[][] input = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] expected = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        assertArrayEquals(expected, ZeroMatrix.zeroMatrix1(input));
    }

    @Test
    public void testZeroMatrix1_singleZero() {
        int[][] input = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        int[][] expected = {
            {1, 0, 3},
            {0, 0, 0},
            {7, 0, 9}
        };

        assertArrayEquals(expected, ZeroMatrix.zeroMatrix1(input));
    }

    @Test
    public void testZeroMatrix1_multipleZeros() {
        int[][] input = {
            {1, 0, 3},
            {4, 5, 6},
            {0, 8, 9}
        };

        int[][] expected = {
            {0, 0, 0},
            {0, 0, 6},
            {0, 0, 0}
        };

        assertArrayEquals(expected, ZeroMatrix.zeroMatrix1(input));
    }

    @Test
    public void testZeroMatrix1_allZeros() {
        int[][] input = {
            {0, 0},
            {0, 0}
        };

        int[][] expected = {
            {0, 0},
            {0, 0}
        };

        assertArrayEquals(expected, ZeroMatrix.zeroMatrix1(input));
    }

    @Test
    public void testZeroMatrix1_noRowsOrColumns() {
        int[][] input = {};
        int[][] expected = {};

        assertArrayEquals(expected, ZeroMatrix.zeroMatrix1(input));
    }

    @Test
    public void testZeroMatrix1_singleRow() {
        int[][] input = {
            {1, 0, 3}
        };

        int[][] expected = {
            {0, 0, 0}
        };

        assertArrayEquals(expected, ZeroMatrix.zeroMatrix1(input));
    }

    @Test
    public void testZeroMatrix1_singleColumn() {
        int[][] input = {
            {1},
            {0},
            {3}
        };

        int[][] expected = {
            {0},
            {0},
            {0}
        };

        assertArrayEquals(expected, ZeroMatrix.zeroMatrix1(input));
    }
}
