import java.util.*;

public class Strobo {
    public static void main(String[] args) {
        String s = "6180819";
        System.out.println(checkStrobo(s));
    }

    static boolean checkStrobo(String s) {
        HashMap<Character, Character> map = new HashMap<>();

        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '3');

        int l = 0, r = s.length() - 1;

        while (l <= r) {
            char left = s.charAt(l);
            char right = s.charAt(r);

            if (!map.containsKey(left) || !map.containsKey(right)) {
                return false;
            }

            if (map.get(left) != right) {
                return false;
            }

            l++;
            r--;
        }
        return true;
    }
}