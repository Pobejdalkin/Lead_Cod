import java.util.HashMap;
import java.util.Map;

public class _13RomanToInteger {
    public static void main(String[] args) {

        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public  static int romanToInt(String s) {
        int number = 0;
        Map<Character,Integer> romanNumbers = new HashMap<Character, Integer>();
        romanNumbers.put('I',1);
        romanNumbers.put('V',5);
        romanNumbers.put('X',10);
        romanNumbers.put('L',50);
        romanNumbers.put('C',100);
        romanNumbers.put('D',500);
        romanNumbers.put('M',1000);

        for (int i = 0; i <s.length(); i++) {
            boolean hasNext = i + 1 < s.length();
            boolean nextBigger = hasNext && romanNumbers.get(s.charAt(i)) < romanNumbers.get(s.charAt(i + 1));
            if (nextBigger){
               number += romanNumbers.get(s.charAt(i+1)) - romanNumbers.get(s.charAt(i));
               i++;
           } else {
                number += romanNumbers.get(s.charAt(i));
            }
        }
        return number;
    }

}
