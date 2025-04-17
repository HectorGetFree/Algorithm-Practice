package linkedList.leetcode_82;

import linkedList.ListNode;

public class S_1 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode s = new ListNode(0, head);
        ListNode p1 = s;
        ListNode p2 = p1.next;

        while (p2 != null && p2.next != null) {
            if (p2.val != p2.next.val) {
                p1 = p1.next;
            } else {
                while (p2.next != null && p2.val == p2.next.val) {
                    p2 = p2.next;
                }
                p1.next = p2.next;
            }
            p2 = p2.next;
        }

        return s.next;

    }
}
