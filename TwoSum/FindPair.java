package TwoSum;

import java.util.HashMap;
public class FindPair {

    public int[] getPair(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            val = target - nums[i];
            if (hm.containsKey(val)) {
                return new int[]{hm.get(val), i};
            }
            hm.put(nums[i], i);

        }
        return null;
    }
}
