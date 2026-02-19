import java.util.HashMap;

public class _383RansomNote {
    public static void main(String[] args) {

        String ransomNote="cc";
        String magazine="abc";

        System.out.println(canConstruct(ransomNote, magazine));


    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            charCount.merge(c, 1, Integer::sum);
        }
        for(char c : ransomNote.toCharArray()){
            charCount.merge(c,-1,Integer::sum);
        }
        for(int i : charCount.values()){
            if (i<0) return false;
        }
        return true;
    }
}

