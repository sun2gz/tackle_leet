package psun;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 *
 * solution:
 *      http://bookshadow.com/weblog/2015/09/28/leetcode-find-duplicate-number/ (only thought, coding is wrong)
 */

public class Main {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,5};

        int rep = findDuplicate(nums);

        System.out.println(rep);
    }

    static int findDuplicate(int[] nums) {

        int high = (nums.length-1);
        int low = 1;

        while (low<high) {
            int middle = (low+high)/2;

            int counter = 0;
            for (int i : nums) {
                if (low <= i && i <= middle) {
                    counter++;
                }
            }

            if (counter > (middle-low+1)) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }

        return low;

    }
}
