import java.util.Arrays;

public class _55JumpGame {
    public static void main(String[] args) {

        int[] nums = {2,0,0};

        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums){
        if (nums.length <=1) return true;
        if (nums[0] == 0) return false;
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current--;
            if (current < nums[i]){current=nums[i];}
            if (current<=0 && i<nums.length-1){return false;}
        }
        return true;
    }


/**
    public static boolean canJump(int[] nums) {
        if (nums.length < 2){return true;}
        int pos = 0;
        int[] nums_tmp = Arrays.copyOf(nums, nums.length);
        int nums_tmp_pos = nums_tmp[pos];
        nums_tmp[pos] = 0;
        for (int i = nums_tmp_pos; i >= -nums_tmp_pos; i--) {
            if (pos+i < 0 || pos+i + 1 > nums.length || i == 0) {continue;}
            if (recursiveJumps(nums_tmp, pos+i)){
                return true;
            };

        }
        return false;
    }

    public static boolean recursiveJumps(int[] nums, int pos){
        if (pos+1== nums.length){return true;}
        if (nums[pos]==0){return false;}
        int[] nums_tmp = Arrays.copyOf(nums, nums.length);
        int nums_tmp_pos = nums_tmp[pos];
        nums_tmp[pos] = 0;
        for (int i = nums_tmp_pos; i >= -nums_tmp_pos; i--) {
            if (pos+i < 0 || pos+i + 1 > nums.length || i == 0) {continue;}
            if (recursiveJumps(nums_tmp, pos+i)){
                return true;
            };
        }
        return false;
    }
  **/
}
