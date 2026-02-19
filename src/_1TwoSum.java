import java.util.Arrays;

public class _1TwoSum {
    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


    static public int[] twoSum(int[] nums, int target) {
        int[] indices = {0, 1};
        while (true) {

            if (nums[indices[0]] + nums[indices[1]] == target) {
                return indices;
            }
            if (nums.length > indices[1] + 1) {
                indices[1]++;
            } else {
                indices[0]++;
                indices[1] = indices[0] + 1;
            }
        }
    }
}
