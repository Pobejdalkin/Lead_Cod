import java.util.Arrays;

public class _27RemoveElement {
    public static void main(String[] args) {
        _27RemoveElement RemEl = new _27RemoveElement();

        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(Arrays.toString(nums));
        int l = RemEl.remove(nums, val);
        System.out.println(Arrays.toString(nums));
        System.out.println(l);

    }


    public int remove(int nums[], int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j]!=val){
                        k++;
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
            else k++;
        }
        return k;
    }
}