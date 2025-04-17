package linkedList.leetcode_23;

import linkedList.ListNode;


public class S_1 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        for (int i = 0; i < lists.length - 1; i++) {
            lists[i + 1] = mergeTwoLists(lists[i], lists[i + 1]);
        }
        return lists[lists.length - 1];
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list1 == null) {
            return list1 == null ? list2 : list1;
        }
        if (list1 == null || list1 == null) {
            return list1 == null ? list2 : list1;
        }
        ListNode s = new ListNode(0, null);
        ListNode p = s;
        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }

        return s.next;
    }
}
