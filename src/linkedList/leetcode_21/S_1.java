package linkedList.leetcode_21;

import linkedList.ListNode;

public class S_1 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list1 == null) {
            return list1 == null ? list2 : list1;
        }
        // 这样做不可行是因为
        // s.next的值从来没有被更新
        // 修改后的代码可行是因为
        // 有两个指针，他们一开始都指向s
        // 我们在更新其中一个时，另一个也被更新
        // 但是仍保留了原来的头节点便于返回
//        ListNode s = new ListNode(0, null);
//        ListNode merge = null;
//        s.next = merge;
//        ListNode newNode = null;
//        ListNode p1 = list1;
//        ListNode p2 = list2;
//
//        while (p1 != null && p2 != null) {
//            if (p1.val < p2.val) {
//                newNode = new ListNode(p1.val, null);
//                p1 = p1.next;
//            } else {
//                newNode = new ListNode(p2.val, null);
//                p2 = p2.next;
//            }
//            if (merge == null) {
//                merge = newNode;
//            } else {
//                merge.next = newNode;
//                merge = merge.next;
//            }
//        }
//
//        if (p1 != null) {
//            merge.next = p1;
//        }
//        if (p2 != null) {
//            merge.next = p2;
//        }

//        return s.next;
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
