package vhsssr.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean isMatch(String string, String pattern) {
        if (pattern.equals(".*")){
            return true;
        }
        if (pattern.equals(".")){
            return true;
        }
        if (pattern.equals("*")){
            return false;
        }
        if (pattern.length() == 2 &&  pattern.charAt(1) == '*'){
            if(string.contains(pattern.replace('*',' ').trim())){
                return true;
            } else return false;
        }
        if(pattern.length()>1 && pattern.contains("*")) {
            String[] split = pattern.split("\\*");
            int result = 1;
            for (String str : split) {
                if (string.contains(str.trim())){
                    result *= 1;
                } else result *=0;
            }
            return result ==1 ? true : false;
        }
        return false;
    }


}
