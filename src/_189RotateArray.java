import java.util.Arrays;

public class _189RotateArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int k = 13;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // избавляемся от лишних действий (поворотов массива)
        int parralels = gcd(nums.length, k);
        for (int i = 0; i < parralels ; i++) {
            swap(nums,k,i);
        }

    }

    public static int gcd(int a, int b) {
        if (b == 0) {            // покажет сколько рядов нужно будет пройти
            return a;
        }
        return gcd(b, a % b);
    }

    public static void swap(int[] nums, int k, int offset) {
        int basket = 0;
        int tmp = 0;
        int i = offset;
        basket = nums[i]; //take from here
        do {
            i = getI(nums, k, i);

            tmp = nums[i];   // swap
            nums[i] = basket; // put here
            basket = tmp;     // swap for next

        } while (i != offset);

    }

    private static int getI(int[] nums, int k, int i) {
        i = (i + k)% nums.length;
        return i;
    }
}
