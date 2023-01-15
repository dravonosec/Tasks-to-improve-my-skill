package test.java.com.tasks.justTasks.LeetCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static main.java.com.tasks.justTasks.LeetCode.SmallestIntegerDivisiblebyK.smallestRepunitDivByK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSmallesIntegerDivisibleByK {
    @Test
    @DisplayName("1 (k=1)")
    public void simpleTest1(){
        var ans = smallestRepunitDivByK(1);
        assertEquals(1, ans);
    }
    @Test
    @DisplayName("Not exist (k=2)")
    public void simpleTest2(){
        var ans = smallestRepunitDivByK(2);
        assertEquals(-1, ans);
    }
    @Test
    @DisplayName("111 (k=3)")
    public void simpleTest3(){
        var ans = smallestRepunitDivByK(3);
        assertEquals(3, ans);
    }
    @Test
    @DisplayName("111111 (k=7)")
    public void simpleTest4(){
        var ans = smallestRepunitDivByK(7);
        assertEquals(6, ans);
    }
}
