package linkedList.leetcode_83;

import linkedList.ListNode;

import static linkedList.leetcode_83.S_2.deleteDuplicates;

public class Main {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(3, null);
        ListNode l4 = new ListNode(3, l5);
        ListNode l3 = new ListNode(2, l4);
        ListNode l2 = new ListNode(1, l3);
        ListNode l1 = new ListNode(1, l2);

        deleteDuplicates(l1);
    }
}
