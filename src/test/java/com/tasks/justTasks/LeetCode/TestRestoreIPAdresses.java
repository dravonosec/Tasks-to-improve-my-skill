package test.java.com.tasks.justTasks.LeetCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static main.java.com.tasks.justTasks.LeetCode.RestoreIPAddresses.restoreIpAddresses;
import static main.java.com.tasks.justTasks.LeetCode.SmallestIntegerDivisiblebyK.smallestRepunitDivByK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRestoreIPAdresses {
    @Test
    @DisplayName("25525511135")
    public void simpleTest1(){
        var ans = restoreIpAddresses("25525511135");
        var output = List.of("255.255.11.135","255.255.111.35");
        assertEquals(output, ans);
    }

    @Test
    @DisplayName("0000")
    public void simpleTest2(){
        var ans = restoreIpAddresses("0000");
        var output = List.of("0.0.0.0");
        assertEquals(output, ans);
    }

    @Test
    @DisplayName("101023")
    public void simpleTest3(){
        var ans = restoreIpAddresses("101023");
        var output = List.of("1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3");
        assertEquals(output, ans);
    }
}
