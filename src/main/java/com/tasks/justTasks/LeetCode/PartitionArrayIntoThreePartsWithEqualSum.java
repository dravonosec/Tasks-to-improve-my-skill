package main.java.com.tasks.justTasks.LeetCode;

import java.io.Console;

// https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/description/
// 69 of 72 test passed
public class PartitionArrayIntoThreePartsWithEqualSum {

    public static boolean canThreePartsEqualSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        if (sum % 3 != 0 && sum != 0)
             return false;

        int subSum = 0;
        int sumCounter = 0;

        for (int i = 0; i < arr.length; i++){
            subSum += arr[i];
            if (subSum == sum/3 && sumCounter < 2 && i != arr.length-1){
                sumCounter++;
                subSum = 0;
            }
        }
        if (subSum == sum/3){
            sumCounter++;
        }
        return sumCounter == 3;
    }
}
