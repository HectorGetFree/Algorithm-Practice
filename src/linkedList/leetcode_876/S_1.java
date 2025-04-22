package linkedList.leetcode_876;

import linkedList.ListNode;

public class S_1 {
    public static ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        int counter = 0;
        ListNode p = head;
        while (p != null) {
            counter++;
            p = p.next;
        }

        int mid;
        if (counter % 2 == 0) {
            mid = (counter / 2) + 1;
        } else {
            mid = (counter + 1) / 2;
        }
        counter = 0;
        p = head;
        while (counter < mid - 1) {
            counter++;
            p = p.next;
        }
        return p;
    }
}
