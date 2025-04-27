package array.leetcode_88;

import java.util.Arrays;

// 利用数组复制与排序 -- 时间与空间复杂度较高
public class S_1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
