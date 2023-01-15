package main.java.com.tasks.justTasks.Tinkoff;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i<n; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);

        double x = 0;
        double sum = 0;
        x = nums[n/2]/2.0;
        for (int i =0; i < n; i++ ) {
            if ((x * 2) < nums[i])
                sum += x + nums[i] - x * 2;
            else
                sum += x;
        }
        System.out.println(sum/n);
    }
}