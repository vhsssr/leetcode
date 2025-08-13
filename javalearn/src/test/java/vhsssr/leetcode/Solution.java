package vhsssr.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Stream;

class Solution {
        static {
            for(int i=0; i<1; i++){
                longestCommonPrefix(new String[]{"","flow","flight"});
            }
        }


        public static String longestCommonPrefix(String[] strs) {
            Set<String> prefixes = new HashSet<>();

            int min = Arrays.stream(strs) .mapToInt(String::length).min().getAsInt();

            String word = Arrays.stream(strs).filter(str -> str.length() == min).findFirst().get();

            for(int i=1; i<min; i++){
                int count = 0;
                for (String str : strs) {
                    if (str.matches(word.substring(0, word.length()-i))) {
                        prefixes.add(str);
                    }
                }

            }

            return prefixes.stream().findFirst().orElseGet(()-> {return "";});
        }

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flow","flight",""});
    }


    }
