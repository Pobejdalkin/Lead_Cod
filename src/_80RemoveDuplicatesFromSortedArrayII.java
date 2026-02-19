import java.util.Arrays;

public class _80RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 2, 2, 2, 3, 3, 4, 4, 5};

        _80RemoveDuplicatesFromSortedArrayII something = new _80RemoveDuplicatesFromSortedArrayII();
        System.out.println(Arrays.toString(nums));
        System.out.println(something.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }

    public int removeDuplicates(int nums[]) {
        int k = 0;
        int compare = nums[0];
        int L = 0;
        for (int i = 0; i < nums.length; i++) {
            if (L < 2 || nums[i] > compare) {
                nums[k] = nums[i];
                if (nums[i] > compare) {
                    compare = nums[i];
                    L =0;
                }
            }
            if (L < 2) {
                k++;
            }
            L++;
        }
        return k;
    }
}
