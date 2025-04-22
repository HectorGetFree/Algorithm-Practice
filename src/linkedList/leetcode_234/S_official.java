package linkedList.leetcode_234;

import linkedList.ListNode;

public class S_official {
    public boolean isPalindrome(ListNode head) {
        ListNode secondHead = head;
        ListNode fast = head;
        // 找到中间节点
        if(head == null || head.next == null) return true;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            secondHead = secondHead.next;
        }
        ListNode prev = null;
        // 反转后半部分的链表
        while(secondHead != null) {
            ListNode next = secondHead.next;
            secondHead.next = prev;
            prev = secondHead;
            secondHead = next;
        }
        while(prev != null && head != null) {
            if(head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}
