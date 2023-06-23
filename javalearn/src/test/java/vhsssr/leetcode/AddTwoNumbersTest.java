package vhsssr.leetcode;

import org.junit.jupiter.api.Test;
import vhsssr.leetcode.addtwonumbers.AddTwoNumbers;
import vhsssr.leetcode.addtwonumbers.ListNode;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers() {
//        String num1s= "[9,8,7,6,5,4,3,2,1]";
//        String num2s= "[1,2,3,4,5]";
//        ListNode num1 = AddTwoNumbers.readFromString(num1s);
//        ListNode num2 = AddTwoNumbers.readFromString(num2s);
//        ListNode result = AddTwoNumbers.addTwoNumbers(num1, num2);


//        String num1s= "[0]";
//        String num2s= "[0]";
//        ListNode num1 = AddTwoNumbers.readFromString(num1s);
//        ListNode num2 = AddTwoNumbers.readFromString(num2s);
//        ListNode result = AddTwoNumbers.addTwoNumbers(num1, num2);

//        String num1s= "[9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,1]";
//        String num2s= "[1]";
//        ListNode num1 = AddTwoNumbers.readFromString(num1s);
//        ListNode num2 = AddTwoNumbers.readFromString(num2s);
//        ListNode result = AddTwoNumbers.addTwoNumbers(num1, num2);


//        String num1s= "[9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,1]";
//        String num2s= "[0]";
//        ListNode num1 = AddTwoNumbers.readFromString(num1s);
//        ListNode num2 = AddTwoNumbers.readFromString(num2s);
//        ListNode result = AddTwoNumbers.addTwoNumbers(num1, num2);
//        AddTwoNumbers.read(result);


//        String num1s= "[9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9]";
//        String num2s= "[0,0,0,0,0,0,0,0,0,0,0,0,0,1]";
//        ListNode num1 = AddTwoNumbers.readFromString(num1s);
//        ListNode num2 = AddTwoNumbers.readFromString(num2s);
//        ListNode result = AddTwoNumbers.addTwoNumbers(num1, num2);
//        AddTwoNumbers.read(result);

//
//        String num2s= "[9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9]";
//        String num1s= "[0,0,0,0,0,0,0,0,0,0,0,0,0,1]";
//        ListNode num1 = AddTwoNumbers.readFromString(num1s);
//        ListNode num2 = AddTwoNumbers.readFromString(num2s);
//        ListNode result = AddTwoNumbers.addTwoNumbers(num1, num2);
//        AddTwoNumbers.read(result);


//        String num2s= "[0]";
//        String num1s= "[0]";
//        ListNode num1 = AddTwoNumbers.readFromString(num1s);
//        ListNode num2 = AddTwoNumbers.readFromString(num2s);
//        ListNode result = AddTwoNumbers.addTwoNumbers(num1, num2);
//        AddTwoNumbers.read(result);


//        String num2s= "[1]";
//        String num1s= "[0]";
//        ListNode num1 = AddTwoNumbers.readFromString(num1s);
//        ListNode num2 = AddTwoNumbers.readFromString(num2s);
//        ListNode result = AddTwoNumbers.addTwoNumbers(num1, num2);
//        AddTwoNumbers.read(result);

//
        String num2s= "[9,9,9,9,9,9,9]";
        String num1s= "[9,9,9,9]";
        ListNode num1 = AddTwoNumbers.readFromString(num1s);
        ListNode num2 = AddTwoNumbers.readFromString(num2s);
        ListNode result = AddTwoNumbers.addTwoNumbers(num1, num2);
        AddTwoNumbers.read(result);



        String num3s= "[2,4,3]";
        String num4s= "[5,6,4]";
        ListNode num3 = AddTwoNumbers.readFromString(num3s);
        ListNode num4 = AddTwoNumbers.readFromString(num4s);
        result = AddTwoNumbers.addTwoNumbers(num3, num4);
        AddTwoNumbers.read(result);
    }

    @Test
    void readFromString() {
        String num1= "[9,8,7,6,5,4,3,2,1]";
        ListNode test = AddTwoNumbers.readFromString(num1);
        ListNode expected = new ListNode(9, new ListNode(8, new ListNode(7, new ListNode(6, new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))))))));
        AddTwoNumbers.read(expected);
    }
}