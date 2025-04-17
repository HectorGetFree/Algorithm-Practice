package linkedList.leetcode_23;

import linkedList.ListNode;

public class S_2 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return splitAndMerge(lists, 0, lists.length - 1);
    }

    // 返回合并后的值
    private ListNode splitAndMerge(ListNode[] lists, int i, int j) {
        if (i == j) {
            return lists[i];
        }
        int m = (i + j) >>> 1;
        ListNode left = splitAndMerge(lists, i, m);
        ListNode right = splitAndMerge(lists, m + 1, j);
        return mergeTwoLists(left, right);
    }


    public static ListNode mergeTwoLists(ListNode p1, ListNode p2) {
        if (p1 == null || p2 == null) {
            return p1 == null ? p2 : p1;
        }
        ListNode s = new ListNode(0, null);
        ListNode p = s;
//        ListNode p1 = list1;
//        ListNode p2 = list2;

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
