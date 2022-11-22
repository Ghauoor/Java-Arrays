package Questions_Arrays;

public class Difference_Between_Strings {
    public char findTheDifference(String s, String t) {

        char ans = 0;

        for (int i = 0; i < s.length(); i++) {

            ans ^= s.charAt(i);
        }

        for (int j = 0; j < t.length(); j++) {
            ans ^= t.charAt(j);
        }

        return ans;
    }
}
