package linkedList.leetcode_141;

import linkedList.ListNode;

import java.util.HashSet;
import java.util.Hashtable;

// 利用hashSet
public class S_1 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        HashSet<ListNode> listNodes = new HashSet<>();
        ListNode p = head;
        while (p != null) {
            if (!listNodes.add(p)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }
}
