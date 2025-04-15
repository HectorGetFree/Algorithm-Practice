package linkedList.leetcode_83;

import linkedList.ListNode;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class S_2 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        // 双指针
        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != null) {
            if (p1.val == p2.val) {
                p1.next = p2.next;
            } else {
                p1 = p1.next;
            }
            p2 = p2.next;
        }
        return head;
    }
}
