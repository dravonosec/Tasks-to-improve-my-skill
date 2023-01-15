package test.java.com.tasks.justTasks.LeetCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static main.java.com.tasks.justTasks.LeetCode.MaximumSumofanHourglass.maxSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaximumSumofanHourglass {
    @Test
    @DisplayName("Example test 1, 4*4")
    public void simpleTest1(){
        var grid = new int[][]{{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
        var ans = maxSum(grid);
        assertEquals(30, ans);
    }
    @Test
    @DisplayName("Example test 2, 3*3")
    public void simpleTest2(){
        var grid = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        var ans = maxSum(grid);
        assertEquals(35, ans);
    }
}
