package main.java.com.tasks.justTasks.LeetCode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/restore-ip-addresses/description/
// Passed
public class RestoreIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        var ans = new ArrayList<String>();
        for (int len1 = Math.max(1, s.length() - 9); len1 <= 3 && len1 <= s.length() - 3; len1++){
            if(!isValid(s, 0, len1))
                continue;

            for (int len2 = Math.max(1, s.length() - len1 - 6); len2 <= 3 && len2 <= s.length() - len1 - 2; len2 ++){
                if (!isValid(s, len1, len2))
                    continue;

                    for(int len3 = Math.max(1, s.length() - (len1+len2) - 3); len3 <= 3 && len3 <= s.length() - len1 - len2 - 1; len3++){
                        if (isValid(s, len1 + len2, len3))
                            if(isValid(s, len1 + len2 + len3, s.length() - (len1 + len2 + len3) ))
                                ans.add(String.join(".",
                                        s.substring(0, len1),
                                        s.substring(len1, len1 + len2),
                                        s.substring(len1+len2, len1+len2+len3),
                                        s.substring(len1+len2+len3)
                                ));
                    }
                }
            }
        return ans;
    }

    public static boolean isValid (String s, int start, int length){
        var substring = s.substring(start, length + start);
        if ((substring.charAt(0) == '0' && substring.length() != 1)
                || substring.length() > 3
                || substring.length() < 1
                || Integer.parseInt(substring) < 0
                || Integer.parseInt(substring) > 255)
            return false;
        return true;
    }
}
