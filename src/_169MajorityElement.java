public class _169MajorityElement {
    public static void main(String[] args) {

        int nums[] = {1,3,2,3,3,1,3,1,1,5,6,2,2,3};

        System.out.println( majel(nums));

    }

    public static int majel(int nums[]) {
        int current = nums[0];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (current == nums[i]) {
                k++;
            }
            else k--;
            if (k<0){
                current = nums[i];
                k=1;
            }
        }
        return current;
    }
}
