public class _58LengthOfLastWord {
    public static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        String[] s_m = s.split(" ");
        return s_m[s_m.length-1].length();
    }
// решение 2
    public static int lengthOfLastWord2(String s) {
        s = s.trim();
        int l = 0;

        for (int i = s.length() -1 ; i >=0 ; i--) {
            if (s.charAt(i) != ' '){
                l++;
            } else {break;}

            
        }
        return l;
    }
}

