package SimplilearnJava;

import java.util.HashSet;
import java.util.Set;

public class SunkIslands {

    private static final int[][] DIRECTIONS = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static boolean isIslandSunk(int[][] matrix, int tsunamiHeight, int i, int j) {
        return dfs(matrix, tsunamiHeight, i, j);
    }

    private static boolean dfs(int[][] matrix, int tsunamiHeight, int i, int j) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
            return false; // Out of bounds
        }
        if (matrix[i][j] == 0 || matrix[i][j] > tsunamiHeight) {
            return false; // Water cell or cell exceeding tsunami height
        }
        matrix[i][j] = 0; // Mark visited cell

        boolean result = true; // Initialize island flag

        for (int[] direction : DIRECTIONS) {
            int nextI = i + direction[0];
            int nextJ = j + direction[1];

            result &= dfs(matrix, tsunamiHeight, nextI, nextJ); // Explore further
        }
        return result;
    }

    public static int countSunkIslands(int[][] matrix, int tsunamiHeight) {
        int sunkIslands = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0 && isIslandSunk(matrix, tsunamiHeight, i, j)) {
                    sunkIslands++;
                }
            }
        }
        return sunkIslands;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {4, 4, 0, 0, 0},
                {3, 4, 0, 2, 2},
                {3, 3, 0, 2, 2},
                {0, 0, 1, 2, 2},
                {0, 0, 1, 1, 1},
        };
        int tsunamiHeight = 2; // Adjust the tsunami height

        int sunkIslands = countSunkIslands(matrix, tsunamiHeight);
        System.out.println("Number of sunk islands: " + sunkIslands);
    }
}
