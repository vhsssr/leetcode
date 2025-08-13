package vhsssr.leetcode;

public class ReverseListLinked {

    //      Definition for singly-linked list.
    public class ListNode {
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

    public static ListNode reverseList(ListNode head) {
        ListNode reverse = new ListNode();
        int count = 0;
        do {
            System.out.print(count);
            head = head.next;
            count++;
        } while (head != null);

        System.out.print(count);
        return new ListNode(1, null);
    }

    public static void main(String[] args) {
        ListNode list = new ReverseListLinked().buildList1to10();

    }
    public ListNode buildList1to10() {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int i = 1; i <= 10; i++) {
            tail.next = new ListNode(i);
            tail = tail.next;
        }
        return dummy.next;
    }

}
