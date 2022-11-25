package Questions_Arrays;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
       // System.out.println(isPalindrome(s));
        System.out.println(isTruePalindrome(s));

    }

    static public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122
                    || s.charAt(i) >= 48 && s.charAt(i) <= 57) {

                sb.append(s.charAt(i));
            }
        }


        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }


    static public boolean isTruePalindrome(String str) {
        str = str.toLowerCase();
        str = str.trim();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || Character.isLowerCase(str.charAt(i)))
                result = result + str.charAt(i);
        }
        return result.equals(new StringBuilder(result).reverse().toString());
    }
}
