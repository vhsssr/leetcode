package vhsssr.leetcode;

import static java.util.Objects.nonNull;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return convertToLN(readLN(l1)+readLN(l2));

    }
    public static void main(String[] args) {
        ListNode num1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode num2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        addTwoNumbers(num1, num2);
    }

    public static int readLN(ListNode number) {
        ListNode temp = number;
        int result = 0;
        int degree=0;
        do {
            result = (int) (result + temp.val * Math.pow(10,degree));
            degree++;
            if (nonNull(temp.next)) temp = temp.next;
        } while (temp.next != null);

        return (int) (result + temp.val * Math.pow(10,degree));
    }

    public static ListNode convertToLN(int input) {
        int inputValue = input;
        int degree = detectDegree(input);
        ListNode result = new ListNode();
        for (int i = degree; i >= 0; i--) {
            ListNode temp = new ListNode();
            temp.val = (int) (inputValue / Math.pow(10, i));
            inputValue = (int) (inputValue - temp.val * Math.pow(10, i));
            if (i == degree) temp.next = null;
            else temp.next = result;
            result = temp;
        }
        return result;
    }

    public static int detectDegree(int input) {
        int temp;
        int degree = 0;
        do {
            degree++;
            temp = (int) (input % Math.pow(10, degree));
        } while (temp != input);
        return degree - 1;
    }
}

