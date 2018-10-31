
//    My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried
//    because each month a list with the weights of members is published and each month 
//    he is the last on the list which means he is the heaviest.
//
//    I am the one who establishes the list so I told him: "Don't worry any more, I will"
//    + " modify the order of the list". It was decided to attribute a "weight" to numbers.
//    The weight of a number will be from now on the sum of its digits.
//
//    For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will
//    come before 99. Given a string with the weights of FFC members in normal order can you
//    give this string ordered by "weights" of these numbers?
//
//    Example:
//    "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes: "100 180 90 56 65 74 68 86 99"
//
//    When two numbers have the same "weight", let us class them as if they were strings 
//    and not numbers: 100 is before 180 because its "weight" (1) is less than the one of
//    180 (9) and 180 is before 90 since, having the same "weight" (9) it comes before as a string.
//
//    All numbers in the list are positive numbers and the list can be empty.
//
//    Notes
//    it may happen that the input string have leading, trailing whitespaces and more than
//    a unique whitespace between two consecutive numbers
//    Don't modify the input
//    For C: The result is freed.
//    URL: https://www.codewars.com/kata/weight-for-weight/train/java

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class WeightSort {

//    check the solution
    public static void main(String[] args) {
        System.out.println(orderWeight("103 123 4444 99 2000"));
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
    
//    the problem is with repeating numbers, because key in map must be unique
    public static String orderWeight(String strng) {
        String[] stringArray = strng.split(" ");
        Integer[] integerArray = new Integer[stringArray.length];
        Map<String, Integer> keyMap = new TreeMap<>();
        Map<String, Integer> map = new TreeMap<>();
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length(); j++) {
                sum += Integer.parseInt(Character.toString(stringArray[i].charAt(j)));
            }
            integerArray[i] = sum;
            sum = 0;
        }
        for (int i = 0; i < stringArray.length; i++) {
            map.put(stringArray[i], integerArray[i]);
        }
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
        List<String> sortedList = new ArrayList<>(sortedMap.keySet());
        for (int i = 0; i < sortedMap.size(); i++) {
            builder.append(sortedList.get(i));
            builder.append(" ");
        }
        builder.deleteCharAt(builder.lastIndexOf(" "));
        return builder.toString();
    }
}
