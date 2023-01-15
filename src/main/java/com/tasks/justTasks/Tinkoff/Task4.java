package main.java.com.tasks.justTasks.Tinkoff;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long l = scanner.nextInt();
        long r = scanner.nextInt();

        System.out.println(countDigits(l, r));
    }

    static long countDigits(long l, long r)
    {
        long rank = 0;
        long res = 0;

        long n = (long)Math.log10(r) + 1;

        for(long i = 0; i < n; i++) {

            rank = rank * 10 + 1;

            for(long j = 1; j <= 9; j++) {
                if (l <= (rank * j) && (rank * j) <= r)
                    res++;
            }
        }
        return res;
    }
}
