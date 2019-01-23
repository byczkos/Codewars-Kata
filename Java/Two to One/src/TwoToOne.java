
//    Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string,
//    the longest possible, containing distinct letters,
//
//    each taken only once - coming from s1 or s2. #Examples: ``` a = "xyaabbbccccdefww"
//    b = "xxxxyyyyabklmopq" longest(a, b) -> "abcdefklmopqwxy"
//    a = "abcdefghijklmnopqrstuvwxyz" longest(a, a) -> "abcdefghijklmnopqrstuvwxyz" ```

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        StringBuilder builder = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            list.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            list.add(s2.charAt(i));
        }
        List<Character> uniqueList = list.stream().distinct().sorted().collect(Collectors.toList());
        for (int i = 0; i < uniqueList.size(); i++) {
            builder.append(uniqueList.get(i));
        }
        return builder.toString();
    }
}
