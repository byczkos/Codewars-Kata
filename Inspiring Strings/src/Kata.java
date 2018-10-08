
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//    When given a string of space separated words, return the word with the longest length.
//    If there are multiple words with the longest length, return the last instance of the word
//    with the longest length.
//
//    Example:
//
//    'red white blue' //returns string value of white
//
//    'red blue gold' //returns gold
public class Kata {

    public static void main(String[] args) {
        System.out.println(longestWord("Daj mi czekac"));
    }

    public static String longestWord(String wordString) {
        String[] tableOfString = wordString.split(" ");
        Map<Integer, String> map = new HashMap<>();
        List<Integer> lengthsList = new ArrayList<>();
        for (int i = 0; i < tableOfString.length; i++) {
            map.put(tableOfString[i].length(), tableOfString[i]);
            lengthsList.add(tableOfString[i].length());

        }
        Integer maxValue = Collections.max(lengthsList);
//        Map sorting
//        Map<Integer, String> sortedMap = lengthsMap.entrySet()
//                .stream()
//                .sorted(Map.Entry.<Integer, String>comparingByValue())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.println(sortedMap);
        return map.get(maxValue);
    }
}
