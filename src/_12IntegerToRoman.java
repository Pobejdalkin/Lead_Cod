import java.util.HashMap;
import java.util.Map;

public class _12IntegerToRoman {
    public static void main(String[] args) {

        int num = 2984;
        System.out.println(intToRoman(num));

    }

    public static String intToRoman(int num) {
        String roman = "";


        HashMap<Integer,Character> romanNumbers = new HashMap<Integer, Character>();
        romanNumbers.put(1,'I');
        romanNumbers.put(5,'V');
        romanNumbers.put(10,'X');
        romanNumbers.put(50,'L');
        romanNumbers.put(100,'C');
        romanNumbers.put(500,'D');
        romanNumbers.put(1000,'M');

        for (int i = 3; i >= 0; i--) {
            if (Math.pow(10,i) <= num){
                int tmp_num = (int) (num - num % Math.pow(10,i));
                int amount  = (tmp_num / (int) Math.pow(10,i))%10;
                if (amount == 9){
                    roman += (romanNumbers.get((int) Math.pow(10,i)));
                    roman += (romanNumbers.get((int) Math.pow(10,i+1)));
                } else if(amount > 5) {
                    roman += romanNumbers.get(5*(int) Math.pow(10,i));
                    for (int j = 5; j < amount; j++) {
                        roman += romanNumbers.get((int) Math.pow(10,i));
                    }
                } else if (amount == 5){
                    roman += romanNumbers.get(5*(int) Math.pow(10,i));
                } else if (amount == 4){
                    roman += romanNumbers.get((int) Math.pow(10,i));
                    roman += romanNumbers.get(5*(int) Math.pow(10,i));
                } else {
                    for (int j = 0; j < amount; j++) {
                        roman += romanNumbers.get((int) Math.pow(10,i));
                    }
                }

            }
        }

        return roman;

    }
}
//  n00 = x * 100
// x = n00/100
// x = 1...9