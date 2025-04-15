package linkedList.leetcode_83;

import linkedList.ListNode;

import java.util.*;

public class S_1 {

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> n = new TreeSet<>(Collections.reverseOrder());

        ListNode p = head;

        while (p != null) {
            n.add(p.val);
            p = p.next;
        }
        ListNode newHead = null;
        ListNode thisHead = null;
        for (int i : n) {
            thisHead = new ListNode(i, newHead);
            newHead = thisHead;
        }
        return newHead;
    }
}
