package psun;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        int[] results = twoSum(nums, 9);

        if (results == null) {
            System.out.println("Not found");
            return;
        }


        System.out.println("Found");
        for (int i : results) {
            System.out.println(results[i]);
        }
    }

    static int[] twoSum(int[] nums, int target) {
        // key is the array element value, value is the index
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                int[] arr = {map.get(target-nums[i]), i};
                return arr;
            }

            if (!map.containsKey(nums[i])) {
                map.put(nums[i],i);
            }
        }

        return null;
    }
}
