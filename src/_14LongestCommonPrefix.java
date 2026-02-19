import java.util.Arrays;

public class _14LongestCommonPrefix {
    public static void main(String[] args) {


        String[] strs = {"fafa","faf","fff","fafafa",};

        System.out.println(longestCommonPrefix2(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length < 1) {
            return "";
        }
        int offset = 201;
        int length = 0;
        Character[] chars = new Character[200];

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < 1) {
                return "";
            }
            for (int j = 0; j < strs[i].length() && j < offset; j++) {
                if (chars[j] == null) {
                    chars[j] = strs[i].charAt(j);
                }
                if (strs[i].charAt(j) != chars[j]) {
                    offset = j;
                }
                if (!(j+1 < strs[i].length() && j < offset)){
                    length = j+1;
                }
            }

        }
        String output = "";

        for (int i = 0; i < offset && i<length; i++) {
            output += chars[i];
        }
        return output;
    }

    public static String longestCommonPrefix2(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
