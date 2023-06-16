package vhsssr.leetcode.addtwonumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
    }

    @Test
    void readFromString() {
        String num1= "[9,8,7,6,5,4,3,2,1]";
        ListNode test = AddTwoNumbers.readFromString(num1);
        ListNode expected = new ListNode(9, new ListNode(8, new ListNode(7, new ListNode(6, new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))))))));
//        Assertions.assertEquals(expected,test);
        AddTwoNumbers.read(expected);
    }
}