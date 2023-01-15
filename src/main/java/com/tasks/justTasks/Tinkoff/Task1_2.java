package main.java.com.tasks.justTasks.Tinkoff;

public class Task1_2 {
    public static void task2 (int n) {
        int numOf2 = 0;
        long count = 0;

        while (n > 0)
        {
            numOf2 = divBy2(n);
            n = n - (int)Math.pow(2, numOf2);
            count += numOf2;
        }
        System.out.println(count);
    }

    public static int divBy2(double n)
    {
        int count = 0;
        while (n > 1){
            n = Math.ceil(n/2);
            count++;
        }
        return count;
    }
}

//#include <cstdlib>
//#include <cmath>
//#include <iostream>
//
//
//        int main() {
//        int N;
//        int numOf2;
//        unsigned long int count = 0;
//        std::cin >> N;
//        while (N > 0) {
//        numOf2 = divBy2(N);
//        N = N - pow(2, numOf2);
//        count += numOf2;
//        }
//        std::cout << count;
//        return EXIT_SUCCESS;
//        }