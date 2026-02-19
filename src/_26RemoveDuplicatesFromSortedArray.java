import java.util.Arrays;

public class _26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
    int nums[]={1,1,2,2,2,2,2,3,3,4,4,5};

    _26RemoveDuplicatesFromSortedArray something = new _26RemoveDuplicatesFromSortedArray();
    System.out.println(Arrays.toString(nums));
    System.out.println(something.removeDuplicates(nums));
    System.out.println(Arrays.toString(nums));

    }

    public int removeDuplicates(int nums[]){
        int k = 0;
        int compare = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!= compare){
                nums[++k] = nums[i];
                compare = nums[i];
            }
        }
        return k+1;
    }
}
