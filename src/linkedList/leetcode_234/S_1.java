package linkedList.leetcode_234;

import linkedList.ListNode;

public class S_1 {
    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }

        p = head;
        int[] left = new int[count / 2];
        int[] right = new int[count / 2];
        int n = 0;
        while (p != null) {
            if (n < count / 2) {
                left[n] = p.val;
            } else if (count % 2 ==0 && n >= count / 2) {
                right[n - count / 2] = p.val;
            } else if (count % 2 != 0 && n > count / 2) {
                right[n - count / 2 - 1] = p.val;
            }
            n++;
            p = p.next;
        }

        for (int i = 0; i < count / 2; i++) {
            if (left[i] != right[count / 2 - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
