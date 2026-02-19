public class _392IsSubsequense {
    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaaaa";

        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = -1;
        while (i < s.length()) {
            while (j < t.length()) {
                j++;
                if (!(j < t.length())) {
                    return false;
                }
                if (t.charAt(j) == s.charAt(i)) {
                    i++;
                    break;
                }
            }

        }
        return true;
    }

}
