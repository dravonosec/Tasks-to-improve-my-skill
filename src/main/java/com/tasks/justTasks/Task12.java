package main.java.com.tasks.justTasks;

import java.util.HashSet;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String b = scanner.nextLine();

        long A = Integer.parseInt(b.split(" ")[0]);
        long B = Integer.parseInt(b.split(" ")[1]);
        long C = Integer.parseInt(b.split(" ")[2]);
        HashSet<Long> diffSums = new HashSet<>();
        for (long i = 0; i<=n/A+1; i++){
            for (long j = 0; j<=n/B+1;j++)
                for (long k = 0; k <=n/C+1; k++) {
                    long sum = A * i + B * j + C * k + 1;
                    if (sum <= n)
                        diffSums.add(sum);
                }
        }
        System.out.println(diffSums.size());
    }
}
