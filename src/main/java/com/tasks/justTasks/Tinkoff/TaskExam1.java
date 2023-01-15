package main.java.com.tasks.justTasks.Tinkoff;

import java.util.Scanner;

public class TaskExam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int a3 = scanner.nextInt();

            if (Math.abs(a1-a2)==Math.abs(a3-a1) || Math.abs(a2-a3)==Math.abs(a1-a2) || Math.abs(a3-a1)==Math.abs(a2-a3))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
