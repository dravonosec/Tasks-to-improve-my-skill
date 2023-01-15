package test.java.com.tasks.justTasks.LeetCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static main.java.com.tasks.justTasks.LeetCode.PartitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPartitionIntoThreePartsWithEqualSum {

    @Test
    @DisplayName("Simple test 1")
    public void simpleTest1(){
        var arr = new int[]{0,2,1,-6,6,-7,9,1,2,0,1};
        var ans = canThreePartsEqualSum(arr);
        assertEquals(true, ans);
    }
    @Test
    @DisplayName("Simple test 2")
    public void simpleTest2(){
        var arr = new int[]{0,2,1,-6,6,7,9,-1,2,0,1};
        var ans = canThreePartsEqualSum(arr);
        assertEquals(false, ans);
    }

    @Test
    @DisplayName("Simple test 3")
    public void simpleTest3(){
        var arr = new int[]{3,3,6,5,-2,2,5,1,-9,4};
        var ans = canThreePartsEqualSum(arr);
        assertEquals(true, ans);
    }

    @Test
    @DisplayName("3 zeros")
    public void zeros(){
        var arr = new int[]{0,0,0};
        var ans = canThreePartsEqualSum(arr);
        assertEquals(true, ans);
    }

    @Test
    @DisplayName("4 zeros")
    public void fourZeros(){
        var arr = new int[]{0,0,0,0};
        var ans = canThreePartsEqualSum(arr);
        assertEquals(true, ans);
    }
}
