package main.java.com.tasks.justTasks.LeetCode;

public class Convert1DArrayInto2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m*n) return new int[0][0];
        int[][] result = new int[m][n];
        int k = 0;
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                result[i][j] = original[k++];
            }
        }
        return result;
    }
}
