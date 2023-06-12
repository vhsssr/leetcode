package vhsssr.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {


    @Test
    void addTwoNumbers() {
        AddTwoNumbers.ListNode listNode = AddTwoNumbers.addTwoNumbers(AddTwoNumbers.convertToLN(999999), AddTwoNumbers.convertToLN(988));
        Assertions.assertEquals(1000987,AddTwoNumbers.readLN(listNode));

        AddTwoNumbers.ListNode listNode2 = AddTwoNumbers.addTwoNumbers(AddTwoNumbers.convertToLN(0), AddTwoNumbers.convertToLN(0));
        Assertions.assertEquals(0,AddTwoNumbers.readLN(listNode2));
    }

    @Test
    void convertToLN() {
        AddTwoNumbers.ListNode test = AddTwoNumbers.convertToLN(32);
        AddTwoNumbers.ListNode expected = new AddTwoNumbers.ListNode(2, new AddTwoNumbers.ListNode(3, null));
        Assertions.assertEquals(expected, test);


        AddTwoNumbers.ListNode test1 = AddTwoNumbers.convertToLN(98765);
        AddTwoNumbers.ListNode expected1 = new AddTwoNumbers.ListNode(5,
                new AddTwoNumbers.ListNode(6,
                        new AddTwoNumbers.ListNode(7,
                                new AddTwoNumbers.ListNode(8,
                                        new AddTwoNumbers.ListNode(9,
                                                null)))));
        Assertions.assertEquals(expected1, test1);

        AddTwoNumbers.ListNode test2 = AddTwoNumbers.convertToLN(1110);
        AddTwoNumbers.ListNode expected2 = new AddTwoNumbers.ListNode(0,
                new AddTwoNumbers.ListNode(1,
                        new AddTwoNumbers.ListNode(1,
                                new AddTwoNumbers.ListNode(1,
                                        null))));
        Assertions.assertEquals(expected2, test2);

        AddTwoNumbers.ListNode test3 = AddTwoNumbers.convertToLN(2);
        AddTwoNumbers.ListNode expected3 = new AddTwoNumbers.ListNode(2, null);
        Assertions.assertEquals(expected3, test3);

        AddTwoNumbers.ListNode test4 = AddTwoNumbers.convertToLN(2586457);
        AddTwoNumbers.ListNode expected4 = new AddTwoNumbers.ListNode(7,
                new AddTwoNumbers.ListNode(5,
                        new AddTwoNumbers.ListNode(4,
                                new AddTwoNumbers.ListNode(6,
                                        new AddTwoNumbers.ListNode(8,
                                                new AddTwoNumbers.ListNode(5,
                                                        new AddTwoNumbers.ListNode(2,
                                                                null)))))));
        Assertions.assertEquals(expected4, test4);
    }

    @Test
    void detectDegree() {
        int test = AddTwoNumbers.detectDegree(32);
        Assertions.assertEquals(1, test);
        int test1 = AddTwoNumbers.detectDegree(312);
        Assertions.assertEquals(2, test1);
        int test2 = AddTwoNumbers.detectDegree(2);
        Assertions.assertEquals(0, test2);
        int test3 = AddTwoNumbers.detectDegree(30000000);
        Assertions.assertEquals(7, test3);

        int test4 = AddTwoNumbers.detectDegree(0);
        Assertions.assertEquals(0, test4);
        int test5 = AddTwoNumbers.detectDegree(1);
        Assertions.assertEquals(0, test5);

    }

    @Test
    void readLN() {
        int expected4 =  2586457;
        AddTwoNumbers.ListNode testNum = new AddTwoNumbers.ListNode(7,
                new AddTwoNumbers.ListNode(5,
                        new AddTwoNumbers.ListNode(4,
                                new AddTwoNumbers.ListNode(6,
                                        new AddTwoNumbers.ListNode(8,
                                                new AddTwoNumbers.ListNode(5,
                                                        new AddTwoNumbers.ListNode(2,
                                                                null)))))));
        int test = AddTwoNumbers.readLN(testNum);
        Assertions.assertEquals(expected4,test);


        int expected1 =  0;
        AddTwoNumbers.ListNode testNum1 = new AddTwoNumbers.ListNode(0);
        int test1 = AddTwoNumbers.readLN(testNum1);
        Assertions.assertEquals(expected1,test1);
    }
}
