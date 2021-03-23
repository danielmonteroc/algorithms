package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AnagramAddReduce {

    public static class CharacterCounter {
        private final Map<Integer, Integer> map = new HashMap<>();

        public void add(int c) {
            put(c, +1);
        }

        public void remove(int c) {
            put(c, -1);
        }

        public void put(int c, int adding) {
            map.put(c, Optional.ofNullable(map.get(c)).orElse(0) + adding);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        public int get(int c) {
            if (map.get(c) == null) {
                return 0;
            } else {
                return map.get(c);
            }
        }

        public int getV2(int c) {
            return Optional.ofNullable(map.get(c)).orElse(0);
        }

        public boolean isEmpty() {
            return map.isEmpty();
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        var characterCounter = new CharacterCounter();
        s1.chars().forEach(characterCounter::add);
        s2.chars().forEach(characterCounter::remove);
        return characterCounter.isEmpty();
    }
}
