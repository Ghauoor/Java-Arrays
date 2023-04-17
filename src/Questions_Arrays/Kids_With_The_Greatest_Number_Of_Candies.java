package Questions_Arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

public class Kids_With_The_Greatest_Number_Of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;

        for (int candy :
                candies) {
            max = Math.max(candy, max);
        }

        for (int candy :
                candies) {
            ans.add(candy + extraCandies >= max);
        }

        return ans;
    }
}
