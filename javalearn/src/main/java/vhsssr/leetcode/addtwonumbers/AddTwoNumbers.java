package vhsssr.leetcode.addtwonumbers;

import com.google.common.annotations.VisibleForTesting;

public class AddTwoNumbers {
    public static void main(String[] args) {
//        ListNode num1 = new ListNode(1);
//        ListNode num2 = new ListNode(1);
//        ListNode result = addTwoNumbers(num1, num2);
    }

    public static ListNode addTwoNumbers(ListNode num1, ListNode num2) {
        StringBuilder a = read(num1);
        StringBuilder b = read(num2);
        if (a.length() > b.length()) {
            StringBuilder c = solve(num1, num2);
            return readFromString(c.toString());
        }
        if (a.length() < b.length()) {
            StringBuilder c = solve(num2, num1);
            return readFromString(c.toString());
        }
        solve2(num1, num2);
        return readFromString(solve2(num1, num2).toString());
    }

    private static StringBuilder solve(ListNode large, ListNode less) {
        StringBuilder c = new StringBuilder("[");
        byte overstack = 0;
        while (null != large.next) {
            int sum;
            if (1 == overstack) {
                if (null != less) {
                    sum = large.val + less.val + overstack;
                    large = large.next;
                    less = less.next;
                } else {
                    sum = large.val + overstack;
                    large = large.next;
                }
                overstack = 0;
            } else {
                if (null != less) {
                    sum = large.val + less.val;
                    large = large.next;
                    less = less.next;
                } else {
                    sum = large.val + overstack;
                    large = large.next;
                }
            }
            if (sum > 9) {
                overstack = 1;
            }
            c.append(sum % 10).append(",");
        }
        if (overstack != 0) {
            if (overstack + large.val > 9) {
                c.append((overstack + large.val) % 10).append(",").append(overstack).append("]");
            } else {
                c.append(overstack + large.val).append("]");
            }
        } else {
            c.append(large.val).append("]");
        }
        return c;
    }

    private static StringBuilder solve2(ListNode large, ListNode less) {
        StringBuilder c = new StringBuilder("[");
        byte overstack = 0;
        while (null != large.next) {
            int sum;
            if (1 == overstack) {
                sum = large.val + less.val + overstack;
                large = large.next;
                less = less.next;
                overstack = 0;
            } else {
                sum = large.val + less.val;
                large = large.next;
                less = less.next;
            }
            if (sum > 9) {
                overstack = 1;
            }
            c.append(sum % 10).append(",");
        }
        if (overstack != 0) {
            if (overstack + large.val + less.val > 9) {
                c.append((overstack + large.val + less.val) % 10).append(",").append(overstack).append("]");
            } else {
                c.append(overstack + large.val + less.val).append("]");
            }
        } else {
            if ( large.val + less.val > 9) {
                c.append(( large.val + less.val) % 10).append(",").append(1).append("]");
            } else {
                c.append( large.val + less.val).append("]");
            }
        }
        return c;
    }

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
//            System.out.print(toread.val);
            tostr.append(toread.val).append(",");
            toread = toread.next;
        }
//        System.out.print(toread.val);
        tostr.append(toread.val).append("]");
//        System.out.println(tostr);
        return tostr;
    }


}
