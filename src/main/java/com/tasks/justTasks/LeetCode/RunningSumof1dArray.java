package main.java.com.tasks.justTasks.LeetCode;

// https://leetcode.com/problems/running-sum-of-1d-array/description/?envType=study-plan&id=level-1
// Passed
public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            result[i] = nums[i] + result[i-1];
        }
        return result;
    }
}
