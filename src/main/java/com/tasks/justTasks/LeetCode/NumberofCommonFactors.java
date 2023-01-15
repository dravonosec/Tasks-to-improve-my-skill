package main.java.com.tasks.justTasks.LeetCode;

// https://leetcode.com/problems/number-of-common-factors/description/
// Passed. Но можно решить быстрее с помощью алгоритма Евклида
public class NumberofCommonFactors{
    public int commonFactors(int a, int b) {
        int max = Math.max(a,b);
        int commonFactorsCounter = 0;
        for (int i = 1; i < max+1; i++){
            if (a % i == 0 && b % i == 0 )
                commonFactorsCounter++;
        }
        return commonFactorsCounter;
    }
}
