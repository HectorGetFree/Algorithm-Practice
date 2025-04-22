package linkedList;

import static linkedList.leetcode_234.S_1.isPalindrome;

public class Main {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(1, null);
        ListNode l4 = new ListNode(2, l5);
        ListNode l3 = new ListNode(1, l4);
        ListNode l2 = new ListNode(1, l3);
        ListNode l1 = new ListNode(1, l2);
        System.out.println(isPalindrome(l3));
    }
}
