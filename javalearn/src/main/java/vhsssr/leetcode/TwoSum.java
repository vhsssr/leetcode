package vhsssr.leetcode;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int last = nums.length - 1;
        for (int i = 0; i <= last-1; i++) {
            for(int j = i+1; j<= last; j++){
                if (target == nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
