import java.util.HashMap;
import java.util.Map;

public class Kadai2 {
    public static void main(String[] args) {
        String s = "dog";
        String t = "god";
        System.out.print(permutation(s, t));
    }

    public static boolean permutation(String s, String t) {
        Map<Character, Integer> char_set = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char_set.put(c, char_set.getOrDefault(c, 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            char_set.put(c, char_set.getOrDefault(c, 0) - 1);
        }

        for (Integer count : char_set.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
