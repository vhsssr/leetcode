package vhsssr.leetcode.addtwonumbers;

import com.google.common.annotations.VisibleForTesting;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode num1 = new ListNode(1);
        ListNode num2 = new ListNode(1);
        ListNode result = addTwoNumbers(num1, num2);
    }

    public static ListNode addTwoNumbers(ListNode num1, ListNode num2) {
        StringBuilder a = read(num1);
        StringBuilder b = read(num2);
        byte overstack = 0;
        if (a.length() > b.length()) {
            while (null != num1.next) {
                int sum;
                if (1 == overstack) {
                    sum = num1.val + num2.val + overstack;
                    overstack = 0;
                } else sum = num1.val + num2.val;
                if (sum > 9) {
                    overstack = 1;
                }
                num1.val = sum % 10;
                num1 = num1.next;
                num2 = num2.next;
            }
        }

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

    public static StringBuilder read(ListNode toread) {
        StringBuilder tostr = new StringBuilder("[");
        while (toread.next != null) {
            System.out.print(toread.val);
            tostr.append(toread.val).append(",");
            toread = toread.next;
        }
        tostr.append(toread.val).append("]");
        System.out.println(tostr);
        return tostr;
    }


}
