package test.java.com.tasks.justTasks.LeetCode;

import main.java.com.tasks.justTasks.LeetCode.ReshapetheMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReshapeMatrix {
    @Test
    @DisplayName("Test Shape 2*2 to 1*4")
    public void TestShape1(){
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        var ans = ReshapetheMatrix.matrixReshape(mat, r, c);
        int[][] output = {{1,2,3,4}};
        assertEquals(output.length, ans.length);
        assertEquals(output[0].length, ans[0].length);
    }

    @Test
    @DisplayName("Test Value 2*2 to 1*4")
    public void TestValue1(){
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        var ans = ReshapetheMatrix.matrixReshape(mat, r, c);
        int[][] output = {{1,2,3,4}};
        for(int i = 0; i < output.length; i++){
            for (int j = 0; j < output[0].length; j ++){
                assertEquals(output[i][j], ans[i][j]);
            }
        }
    }

    @Test
    @DisplayName("Test Shape 2*2 to 2*2")
    public void TestShape2(){
        int[][] mat = {{1,2},{3,4}};
        int r = 2;
        int c = 2;
        var ans = ReshapetheMatrix.matrixReshape(mat, r, c);
        int[][] output = {{1,2},{3,4}};
        assertEquals(output.length, ans.length);
        assertEquals(output[0].length, ans[0].length);
    }

    @Test
    @DisplayName("Test Value 2*2 to 2*2")
    public void TestValue2(){
        int[][] mat = {{1,2},{3,4}};
        int r = 2;
        int c = 2;
        var ans = ReshapetheMatrix.matrixReshape(mat, r, c);
        int[][] output = {{1,2},{3,4}};
        for(int i = 0; i < output.length; i++){
            for (int j = 0; j < output[0].length; j ++){
                assertEquals(output[i][j], ans[i][j]);
            }
        }
    }

}
