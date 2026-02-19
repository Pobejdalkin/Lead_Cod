import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _290WordPattern {
    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (words.length != pattern.length()){return false;}
        Map<Character, String> patterns = new HashMap<Character, String>();
        Map<String, Character> patterns2 = new HashMap<String, Character>();

        for (int i = 0; i < pattern.length(); i++) {
            if (patterns.containsKey(pattern.charAt(i))) {
                if (!Objects.equals(patterns.get(pattern.charAt(i)), words[i])) {
                    return false;
                }
            } else {
                patterns.put(pattern.charAt(i), words[i]);
            }
            if (patterns2.containsKey(words[i])) {
                if (!Objects.equals(patterns2.get(words[i]), pattern.charAt(i))) {
                    return false;
                }
            } else {
                patterns2.put(words[i], pattern.charAt(i));
            }
        }
        return true;

    }
}
