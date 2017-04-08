import java.util.*;
//kdnkknknknkdndkd
public class Ch1_2_CheckPermutation {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "bcadee"; // these test case is not so good#########
        System.out.println(isPermutation(s1, s2));
    }
    
    public static boolean isPermutation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            } else if (map.containsKey(c) && map.get(c) == 1) {
                map.remove(c);
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return map.isEmpty();            
    }
}
