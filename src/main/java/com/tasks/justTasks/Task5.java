package main.java.com.tasks.justTasks;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String b = scanner.nextLine();

        int odds = 0;
        int evens = 0;
        List<Integer> pupils = new ArrayList<Integer>();
        for (String pupil : b.split(" ")) {
            int pup = Integer.parseInt(pupil)%10;
            if (pup%2 == 0)
                evens++;
            else
                odds++;
            pupils.add(pup);
        }

        int[] ans = findPlasesForPupils(n, pupils, odds, evens);
        System.out.print(ans[0]);
        System.out.print(" ");
        System.out.print(ans[1]);
    }

    public static int[] findPlasesForPupils(int n, List<Integer> pupils, int odds, int evens) {

        if (Math.abs(odds-evens)!=0)
            return new int[]{-1,-1};

        int counter = 0;
        int oddPlases = 0;
        int evenPlases = 0;

        int even = -1;
        int odd = -1;
        for (int i = 0; i < n; i++) {
            int pup = pupils.get(i)%10;
            if (pup % 2 == 0 && (i+1) % 10 % 2 == 0)
                evenPlases++;
            else if (pup % 2 == 1 && ((i+1) % 10 % 2 == 1))
                oddPlases++;
            else {
                counter++;
                if ((i+1) % 10 % 2 == 0 )
                    even = i+1;
                else if ((i+1) % 10 % 2 == 1)
                    odd = i+1;
            }
        }
        if (Math.abs(oddPlases-evenPlases)>=2)
            return new int[]{-1,-1};
        if (counter == 0){
            return new int[]{-1,-1};
        }
        else
            return new int[]{odd,even};
    }
}
