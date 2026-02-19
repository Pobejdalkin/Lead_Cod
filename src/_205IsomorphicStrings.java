import java.util.HashMap;
import java.util.Map;

public class _205IsomorphicStrings {
    public static void main(String[] args) {

        String s = "dade";
        String t = "babe";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {return false;}
        Map<Character,Character> chars = new HashMap<Character, Character>();
        Map<Character,Character> chars2 = new HashMap<Character, Character>();

        for (int i = 0; i <s.length() ; i++) {
            if (chars.containsKey(s.charAt(i))){
                if (chars.get(s.charAt(i))!=t.charAt(i)){return false;}
            } else {
                chars.put(s.charAt(i),t.charAt(i));
            }
            if (chars2.containsKey(t.charAt(i))){
                if (chars2.get(t.charAt(i))!=s.charAt(i)){return false;}
            } else {
                chars2.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}
