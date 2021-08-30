package main.java.com.tasks.justTasks;

import java.util.*;

public class Task2 {
    public static void task2 (){

        Scanner scanner = new Scanner(System.in);
        List<Integer> allData = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            allData.add(scanner.nextInt());
        }
        int leaver = allData.get(allData.size()-1);

        Integer n = allData.get(0);
        Integer t = allData.get(1);
        List<Integer> floors = new ArrayList<Integer>();

        for (int i = 2; i < allData.size() - 2; i++) {
            floors.add(allData.get(i));
        }

        int fromHellToHeaven = 0;
        int fromHeavenToHell = 0;
        for (int i = 1; i != leaver; i++ ) {
            fromHellToHeaven = fromHellToHeaven + floors.get(i) - floors.get(i-1);
        }
        for (int i = leaver + 1; i < floors.size(); i++){
            fromHeavenToHell = fromHeavenToHell + floors.get(i) - floors.get(i-1);
        }
        if (fromHeavenToHell <= t){
            System.out.println(floors.get(n-1) - floors.get(0));
        }
        if (fromHellToHeaven <= t){
            System.out.println(floors.get(n-1) - floors.get(0));
        }
        else
        {
            if (fromHeavenToHell > fromHellToHeaven)
                System.out.println(fromHeavenToHell + 2*fromHellToHeaven);
            else System.out.println(fromHeavenToHell*2 + fromHellToHeaven);
        }
    }
}
