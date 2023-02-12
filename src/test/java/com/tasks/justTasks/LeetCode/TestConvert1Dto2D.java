package test.java.com.tasks.justTasks.LeetCode;

import main.java.com.tasks.justTasks.LeetCode.Convert1DArrayInto2DArray;
import main.java.com.tasks.justTasks.LeetCode.ReshapetheMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConvert1Dto2D {
    @Test
    @DisplayName("Test Shape [1,2,3,4] to [[1,2],[3,4]]")
    public void TestShape1(){
        int[] original = {1,2,3,4};
        int r = 2;
        int c = 2;
        var ans = Convert1DArrayInto2DArray.construct2DArray(original, r, c);
        int[][] output = {{1,2},{3,4}};
        assertEquals(output.length, ans.length);
        assertEquals(output[0].length, ans[0].length);
    }

    @Test
    @DisplayName("Test Value [1,2,3,4] to [[1,2],[3,4]]")
    public void TestValue1(){
        int[] original = {1,2,3,4};
        int r = 2;
        int c = 2;
        var ans = Convert1DArrayInto2DArray.construct2DArray(original, r, c);
        int[][] output = {{1,2},{3,4}};
        for(int i = 0; i < output.length; i++){
            for (int j = 0; j < output[0].length; j ++){
                assertEquals(output[i][j], ans[i][j]);
            }
        }
    }
}
