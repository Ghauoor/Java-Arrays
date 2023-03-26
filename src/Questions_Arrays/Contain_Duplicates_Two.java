package Questions_Arrays;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate-ii/description/
public class Contain_Duplicates_Two {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.size() > k) set.remove(nums[i - k - 1]);

            if (!set.add(nums[i])) return true;
        }

        return false;
    }
}
