package main.java.com.tasks.justTasks.Tinkoff;

import java.util.Scanner;

public class TaskExam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i<n; i++) {
            nums[i] = scanner.nextInt();
        }

        int from = 0;
        int to = 0;
        int counter = 0;

        for (int i = 0; i < n/2; i++){
            if (nums[i] != nums[n-i-1]) {
                counter++;
                from = nums[i];
                to = nums[n-i-1];

                for (int j = i; j < n - i; j++)
                    if (nums[j] == from)
                        nums[j] = to;
            }
        }
        System.out.println(counter);
    }
}
