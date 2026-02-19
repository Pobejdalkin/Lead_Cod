import java.util.Arrays;

public class _88MergeSortedArray {
    public static void main(String[] args) {
        _88MergeSortedArray mergeSortedArray88 = new _88MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        System.out.println(Arrays.toString(nums1));
        mergeSortedArray88.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        if (nums2.length == 0) {
            return;
        }

        while (true) {
            if (i >= m && j >= n) {
                break;
            }
            if (j >= n || i < m && nums1[i] <= nums2[j]) {
                tmp[k] = nums1[i];
                k++;
                i++;
            } else if (i >= m || j < n && (nums1[i] > nums2[j])) {
                tmp[k] = nums2[j];
                k++;
                j++;
            }
        }
        for (int l = 0; l < tmp.length; l++) {
            nums1[l] = tmp[l];
        }
    }
}
