package vhsssr.leetcode;

class Palindrome {

    static {
        for (int i = 0;i<100; i++){
            isPalindrome(45);
        }
    }
    public static boolean isPalindrome(int x) {
        Integer newInt = x;
        String sb = new StringBuilder(String.valueOf(newInt)).reverse().toString();
        return String.valueOf(newInt).equals(sb);
    }
}