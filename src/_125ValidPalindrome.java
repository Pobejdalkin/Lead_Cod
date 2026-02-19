import java.util.Locale;

public class _125ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
