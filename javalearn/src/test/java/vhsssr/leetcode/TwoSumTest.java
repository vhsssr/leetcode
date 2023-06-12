package vhsssr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void twoSumTest1(){
        int[] abc = {2,7,11,15};
        int[] expected = {0,1};
        Assertions.assertArrayEquals(TwoSum.twoSum(abc,9),expected);
    }
    @Test
    public void twoSumTest2(){
        int[] abc = {3,2,4};
        int[] expected = {1,2};
        Assertions.assertArrayEquals(TwoSum.twoSum(abc,6),expected);
    }
    @Test
    public void twoSumTest3(){
        int[] abc = {3,3};
        int[] expected = {0,1};
        Assertions.assertArrayEquals(TwoSum.twoSum(abc,6),expected);
    }
}
