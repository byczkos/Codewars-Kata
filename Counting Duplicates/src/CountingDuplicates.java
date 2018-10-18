
//    Count the number of Duplicates
//    Write a function that will return the count of distinct case-insensitive
//    alphabetic characters and numeric digits that occur more than once in the
//    input string. The input string can be assumed to contain only alphabets 
//    (both uppercase and lowercase) and numeric digits.
//
//    Example
//    "abcde" -> 0 # no characters repeats more than once
//    "aabbcde" -> 2 # 'a' and 'b'
//    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//    "indivisibility" -> 1 # 'i' occurs six times
//    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//    "aA11" -> 2 # 'a' and '1'
//    "ABBA" -> 2 # 'A' and 'B' each occur twice

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    
//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount("Indivisibilities"));
        System.out.println(duplicateCount("ABBA"));
        
    }

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        char[] arr = text.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        Long counter = map.values().stream().filter(i -> i > 1).count();
        return counter.intValue();
    }
}
