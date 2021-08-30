package main.java.com.tasks.justTasks;

import java.util.*;


public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        Integer n = Integer.parseInt(a.split(" ")[0]);
        Integer k = Integer.parseInt(a.split(" ")[1]);

        List<Integer> numbers = new ArrayList<Integer>();
        int sumBefore = 0;
        int sumAfter = 0;
        for (String numChar : b.split(" ")) {
            int num = Integer.parseInt(numChar);
            numbers.add(num);
            sumBefore = sumBefore+num;
        }

        List<Integer> invertRanks = new ArrayList<>();
        for (int num: numbers) {
            int rank = numberRank(num);
            int invertNum = getMaxNumber(rank)-num;
            int count = 1;
            while (invertNum >0){
                invertRanks.add(invertNum%10*count);
                invertNum = invertNum/10;
                count = count*10;
            }
        }

        invertRanks.sort(Comparator.reverseOrder());
        if(invertRanks.size() != 0){
            for (int i = 0; i<k;i++)
            {
                sumAfter = sumAfter+invertRanks.get(i);
            }
        }

        System.out.println(sumAfter);
    }

    public static int getMaxNumber(int rank){
        int invert = 0;
        while (rank>0){
            rank--;
            invert = invert+9*(int)Math.pow(10,rank);

        }
        return invert;
    }

    public static int numberRank (int number){
        int rank = 0;
        while (number>0)
        {
            number = number/10;
            rank++;
        }
        return rank;
    }
}
