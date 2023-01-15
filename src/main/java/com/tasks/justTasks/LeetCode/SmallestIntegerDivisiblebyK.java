package main.java.com.tasks.justTasks.LeetCode;

import java.math.BigInteger;

// https://leetcode.com/problems/smallest-integer-divisible-by-k/description/
public class SmallestIntegerDivisiblebyK {

    public static int smallestRepunitDivByK(int k) {
        BigInteger num = BigInteger.valueOf(1);
        int length = 0;
        for (int i = 0; i < k; i++){
            length++;
            if (num.mod(BigInteger.valueOf(k)) == BigInteger.valueOf(0))
                return length;
            num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(1));
        }
        return -1;
    }
}
