package vhsssr.leetcode.addtwonumbers;

import com.google.common.annotations.VisibleForTesting;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode num1 = new ListNode(1);
        ListNode num2 = new ListNode(1);
        ListNode result = addTwoNumbers(num1, num2);
    }

    public static ListNode addTwoNumbers(ListNode num1, ListNode num2) {
        return null;
    }

    @VisibleForTesting
    public static ListNode readFromString(String numstr) {
        String[] digits = numstr.substring(1, numstr.length() - 1).split(",");
        ListNode result = null;
        ListNode last = new ListNode();
        boolean first = true;
        for (String dig : digits) {
            if (first) {
                first = false;
                result = new ListNode(Integer.parseInt(dig));
                last = result;
            } else {
                ListNode newDig = new ListNode(Integer.parseInt(dig));
                last.next = newDig;
                last = newDig;
            }
        }
        assert result != null;
        return result;
    }


}
