package main.java.com.tasks.justTasks.Tinkoff;
import java.util.Scanner;

public class Task1 {
        public static void task1(int n1) {
            int n = n1;
            int res = 0;
            int pow = 0;
            if (n!=1) {
                while (n > 0) {
                    pow = powCounter(n);
                    n = (n - (int) Math.pow(2, pow));
                    res = res + pow;
                }
                System.out.println(res);
            }
            else
                System.out.println(0);
        }

        public static int powCounter (int n) {
            int piece = 1;
            int pow = 0;

            while (true) {
                if (n - piece < 0) {
                    break;
                } else {
                    piece = piece * 2;
                    pow++;
                }
            }
            return pow;
        }
    }
