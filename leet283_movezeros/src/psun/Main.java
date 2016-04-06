package psun;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeros(nums);

        for (int i : nums)
        {
            System.out.print(i + ", ");
        }
    }

    static void moveZeros(int[] nums) {
        int i=0;
        int j=0;
        while (i<nums.length) {
            if (nums[i]==0) {
                i++;
                continue;
            }

            nums[j] = nums[i];
            i++;
            j++;
        }

        while (j<nums.length) {
            nums[j] = 0;
            j++;
        }
    }

}
