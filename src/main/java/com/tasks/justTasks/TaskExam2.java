package main.java.com.tasks.justTasks;

import java.util.Scanner;

public class TaskExam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        int errors = t.length();
        int tempErrors = 0;
        for (int i = 0; i <= s.length()-t.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(j+i) != t.charAt(j))
                    tempErrors++;
            }
            if (tempErrors < errors)
                errors = tempErrors;
            tempErrors = 0;
        }


        System.out.println(errors);
    }
}
