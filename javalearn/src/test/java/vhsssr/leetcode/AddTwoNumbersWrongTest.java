package vhsssr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vhsssr.leetcode.addtwonumbers.AddTwoNumbersWrong;
import vhsssr.leetcode.addtwonumbers.ListNode;

import static vhsssr.leetcode.addtwonumbers.AddTwoNumbersWrong.addTwoNumbersWrong;

public class AddTwoNumbersWrongTest {


    @Test
    void AddTwoNumbersWrong() {
        ListNode listNode = addTwoNumbersWrong(AddTwoNumbersWrong.convertToLN(999999), AddTwoNumbersWrong.convertToLN(988));
        Assertions.assertEquals(1000987,AddTwoNumbersWrong.readLN(listNode));

        ListNode listNode2 = addTwoNumbersWrong(AddTwoNumbersWrong.convertToLN(0), AddTwoNumbersWrong.convertToLN(0));
        Assertions.assertEquals(0,AddTwoNumbersWrong.readLN(listNode2));
    }

    @Test
    void convertToLN() {
        ListNode test = AddTwoNumbersWrong.convertToLN(32);
        ListNode expected = new ListNode(2, new ListNode(3, null));
        Assertions.assertEquals(expected, test);


        ListNode test1 = AddTwoNumbersWrong.convertToLN(98765);
        ListNode expected1 = new ListNode(5,
                new ListNode(6,
                        new ListNode(7,
                                new ListNode(8,
                                        new ListNode(9,
                                                null)))));
        Assertions.assertEquals(expected1, test1);

        ListNode test2 = AddTwoNumbersWrong.convertToLN(1110);
        ListNode expected2 = new ListNode(0,
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(1,
                                        null))));
        Assertions.assertEquals(expected2, test2);

        ListNode test3 = AddTwoNumbersWrong.convertToLN(2);
        ListNode expected3 = new ListNode(2, null);
        Assertions.assertEquals(expected3, test3);

        ListNode test4 = AddTwoNumbersWrong.convertToLN(2586457);
        ListNode expected4 = new ListNode(7,
                new ListNode(5,
                        new ListNode(4,
                                new ListNode(6,
                                        new ListNode(8,
                                                new ListNode(5,
                                                        new ListNode(2,
                                                                null)))))));
        Assertions.assertEquals(expected4, test4);
    }

    @Test
    void detectDegree() {
        int test = AddTwoNumbersWrong.detectDegree(32);
        Assertions.assertEquals(1, test);
        int test1 = AddTwoNumbersWrong.detectDegree(312);
        Assertions.assertEquals(2, test1);
        int test2 = AddTwoNumbersWrong.detectDegree(2);
        Assertions.assertEquals(0, test2);
        int test3 = AddTwoNumbersWrong.detectDegree(30000000);
        Assertions.assertEquals(7, test3);

        int test4 = AddTwoNumbersWrong.detectDegree(0);
        Assertions.assertEquals(0, test4);
        int test5 = AddTwoNumbersWrong.detectDegree(1);
        Assertions.assertEquals(0, test5);

    }

    @Test
    void readLN() {
        int expected4 =  2586457;
        ListNode testNum = new ListNode(7,
                new ListNode(5,
                        new ListNode(4,
                                new ListNode(6,
                                        new ListNode(8,
                                                new ListNode(5,
                                                        new ListNode(2,
                                                                null)))))));
        int test = AddTwoNumbersWrong.readLN(testNum);
        Assertions.assertEquals(expected4,test);


        int expected1 =  0;
        ListNode testNum1 = new ListNode(0);
        int test1 = AddTwoNumbersWrong.readLN(testNum1);
        Assertions.assertEquals(expected1,test1);
    }
}
