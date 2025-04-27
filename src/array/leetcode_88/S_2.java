package array.leetcode_88;

// 双指针
public class S_2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sort = new int[n + m];
        int p0 = 0;
        int p1 = 0;
        int cur = 0;

        while (p0 < m || p1 < n) {
            if (p0 == m) {
                cur = nums2[p1++];
            } else if (p1 == n) {
                cur = nums1[p0++];
            } else if (nums1[p0] < nums2[p1]) {
                cur = nums1[p0++];
            } else {
                cur = nums2[p1++];
            }
            sort[p0 + p1 - 1] = cur;
        }

        for (int i = 0; i < n + m; i++) {
            nums1[i] = sort[i];
        }
    }
}
