package linkedList;

import static linkedList.leetcode_21.S_1.mergeTwoLists;
import static linkedList.leetcode_82.S_1.deleteDuplicates;

public class Main {
    public static void main(String[] args) {
        ListNode l13 = new ListNode(4, null);
        ListNode l12 = new ListNode(2, l13);
        ListNode list1 = new ListNode(1, l12);

        ListNode l23 = new ListNode(4, null);
        ListNode l22 = new ListNode(3, l23);
        ListNode list2 = new ListNode(1, l22);


        mergeTwoLists(list1, list2);
    }
}
