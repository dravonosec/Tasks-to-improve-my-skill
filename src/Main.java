import java.util.*;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {

    }



    public static String isEntry(String str){
        var chars = new HashSet<Character>();
        var unknown = 0;
        if (str.length() < 10)
            return "NO";
        for(int i = 0; i <= str.length() - 10; i++){
            for(int j = i; j < i + 10; j++){
                if(str.charAt(j) == '?'){
                    unknown++;
                }
                else{
                    chars.add(str.charAt(j));
                }
            }
            if(unknown + chars.size() == 10){
                return "YES";
            }
            unknown = 0;
            chars.clear();
        }
        return "NO";
    }

    public static int tmp(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int maxTemp = -1000000;
        String isColdPrev = "";
        for (int i = 0; i < length; i++){
            int currentTmp = scanner.nextInt();
            String isColdCurrent = scanner.next();
            if ((isColdCurrent.equals("0+") && isColdPrev.equals("-")) || (isColdCurrent.equals("-") && isColdPrev.equals("0+"))){
                if (isColdCurrent.equals("0+")){
                    maxTemp = currentTmp;
                }
                if (isColdCurrent.equals("-")){
                    maxTemp = -1;
                }
            }
            else{
                isColdPrev = isColdCurrent;
                maxTemp = maxTemp + currentTmp;
            }
        }
        scanner.close();
        return maxTemp;
    }

    public static int getMinTelescopeChanges(){
        Scanner scanner = new Scanner(System.in);
        int telescopeCount = scanner.nextInt();
        int stars =  scanner.nextInt();
        int modeCount = scanner.nextInt();
        int changes = 0;
        int[] telescopes = new int[telescopeCount];
        for (int i = 0; i < telescopeCount; i++){
            telescopes[i] = scanner.nextInt();
        }
        for (int i = 0; i < stars; i++){
            int firstTelescope = telescopes[scanner.nextInt()-1];
            int secondTescope = telescopes[scanner.nextInt()-1];
            if (firstTelescope != secondTescope) changes++;
        }
        return changes;
    }

    public static int getMaxProcessorPower(){
        Scanner scanner = new Scanner(System.in);
        int processorCount = scanner.nextInt();
        int[] processors = new int[processorCount];
        for (int i = 0; i < processorCount; i++)
            processors[i] = scanner.nextInt();
        Arrays.sort(processors);
        int[] sums = new int[processorCount];
        for (int i = 0; i < processorCount; i++){
            int sum = 0;
            for (int j = i; j < processorCount; j++) {
                sum+= (processors[j] / processors[i])*processors[i];
            }
            sums[i] = sum;
        }
        Arrays.sort(sums);
        return sums[sums.length-1];
    }
}