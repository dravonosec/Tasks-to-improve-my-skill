package main.java.com.tasks.justTasks.LeetCode;

import java.io.Console;

// https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/description/
// 69 of 72 test passed
public class PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
        var arr1 = new int[]{0,2,1,-6,6,-7,9,1,2,0,1};
        var arr2 = new int[]{0,2,1,-6,6,7,9,-1,2,0,1};
        var arr3 = new int[]{3,3,6,5,-2,2,5,1,-9,4};
        var ans1 = canThreePartsEqualSum(arr1);
        System.out.println(ans1);
        var ans2= canThreePartsEqualSum(arr2);
        System.out.println(ans2);
        var ans3 = canThreePartsEqualSum(arr3);
        System.out.println(ans3);
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(sum);
        if (sum % 3 != 0 && sum != 0)
             return false;
        int subSum = 0;
        int sumCounter = 0;
        for (int i = 0; i < arr.length; i++){
            subSum += arr[i];
            if (subSum == sum/3){
                sumCounter++;
                subSum = 0;
            }
        }
        if (sumCounter == 3 && subSum == 0){
            return true;
        }
        else return false;
    }
}
