package main.java.com.tasks.justTasks.LeetCode;

// https://leetcode.com/problems/maximum-sum-of-an-hourglass/description/
// Passed
public class MaximumSumofanHourglass {
    public static int maxSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int sum = 0;
        int result = 0;
        for (int i = 0; i < n-2; i ++)
            for(int j = 0; j < m-2; j ++)
            {
                sum=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                result = sum > result ? sum : result;
            }
        return result;
    }
}
