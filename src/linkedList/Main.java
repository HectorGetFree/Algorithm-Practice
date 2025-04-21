package linkedList;

import static linkedList.leetcode_21.S_1.mergeTwoLists;
import static linkedList.leetcode_82.S_1.deleteDuplicates;
import static linkedList.leetcode_876.S_1.middleNode;

public class Main {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        middleNode(l1);
    }
}
