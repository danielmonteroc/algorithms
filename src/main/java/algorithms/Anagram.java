package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {

        var map1 = createMap(s1);
        var map2 = createMap(s2);

        return areEqual(map1, map2);
    }

    private static boolean areEqual(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        if (map1.keySet().size() != map2.keySet().size()) {
            return false;
        }
        for (var c : map1.keySet()) {
            if (map1.get(c) != map2.get(c)) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> createMap(String s) {
        var map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
