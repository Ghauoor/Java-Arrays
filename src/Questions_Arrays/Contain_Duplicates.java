package Questions_Arrays;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/

public class Contain_Duplicates {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) return true;
        }

        return false;
    }
}
