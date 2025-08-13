package vhsssr.leetcode;

import java.util.stream.Stream;

public class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        char[] word1toChar = toCharArray(word1);
        char[] word2toChar = toCharArray(word2);

        String result = "";
        if (word1.length() > word2.length() ){
            for(int i = 0; i < word2.length(); i++) {
                result += ""+word1toChar[i] + word2toChar[i];
            }
            return result+=word1.substring(word2.length(),word1.length());
        }
        if (word1.length() < word2.length() ) {
            for(int i = 0; i < word1.length(); i++) {
                result +=""+ word1toChar[i] + word2toChar[i];
            }
            return result+=word2.substring(word1.length(),word2.length());
        }
        else{
            for(int i = 0; i < word2.length(); i++) {
                result += ""+word1toChar[i] + word2toChar[i];
            }
            return result;
        }
    }

    private char[] toCharArray(String x){
        return x.toCharArray();
    }

    public void moveZeroes(int[] nums) {
        if (0==nums.length) {
            print(nums);
        } else {
            int l = 0;
            int[] alt = nums;
            for (int iterate : alt){
                if (iterate > 0){
                    nums[l] = iterate;
                    l++;
                }
            }
            for (int i = l; l < nums.length; i++){
                nums[i] = 0;
            }
            print(nums);
        }

    }
    private void print(int[] arr){
        System.out.println(arr);
    }

    public static void main(String[] args) {
        MergeStrings mergeStrings = new MergeStrings();
        String s = mergeStrings.mergeAlternately("asd", "dsa");
        System.out.println(s);
        mergeStrings.moveZeroes(new int[]{1, 2, 0, 5, 0});

    }

}
