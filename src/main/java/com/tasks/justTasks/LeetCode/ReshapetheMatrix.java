package main.java.com.tasks.justTasks.LeetCode;

public class ReshapetheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length*mat[0].length != r*c) return mat;
        int[][] result = new int[r][c];
        int k = 0;
        int l = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                result[k][l] = mat[i][j];
                l++;
                if (l == c){
                    l = 0;
                    k++;
                }
            }
        }
        return result;
    }
}
