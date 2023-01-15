package main.java.com.tasks.justTasks.Tinkoff;

import java.util.Scanner;

public class TaskExam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i<n; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long tempLength = 0;
        for (int i = 0; i < n; i++){

            for (int j = i; j < n;j++) {
                if (Math.abs(points[i][0]-points[j][0]) > Math.abs(points[i][1]-points[j][1])){
                    tempLength = Math.abs(points[i][0]-points[j][0]);
                }
                else
                    tempLength = Math.abs(points[i][1]-points[j][1]);
                if (max1 < tempLength) {
                    max2 = max1;
                    max1 = tempLength;
                }
                else if (max2 < tempLength)
                    max2 = tempLength;
                tempLength = 0;
            }
        }
        System.out.println(max2);
    }
}
