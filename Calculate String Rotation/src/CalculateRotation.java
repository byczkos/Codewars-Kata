
//    Write a function that receives two strings and returns n, where n is equal to the number
//    of characters we should shift the first string forward to match the second.
//
//    For instance, take the strings "fatigue" and "tiguefa". In this case, the first string has
//    been rotated 5 characters forward to produce the second string, so 5 would be returned.
//
//    If the second string isn't a valid rotation of the first string, the method returns -1.
//    Examples:
//    "coffee", "eecoff" => 2
//    "eecoff", "coffee" => 4
//    "moose", "Moose" => -1
//    "isn't", "'tisn" => 2
//    "Esham", "Esham" => 0
//    "dog", "god" => -1

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculateRotation {

//    ===check the solution ===
    public static void main(String[] args) {
        System.out.println(shiftedDiff("hoop", "pooh"));
        System.out.println(shiftedDiff("coffee", "eecoff"));
        System.out.println(shiftedDiff("eecoff", "coffee"));
        System.out.println(shiftedDiff("moose", "Moose"));
        System.out.println(shiftedDiff("isn't", "'tisn"));
        System.out.println(shiftedDiff("Esham", "Esham"));
        System.out.println(shiftedDiff("dog", "god"));
    }

    static int shiftedDiff(String first, String second) {
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        List<Character> firstList = new ArrayList<>();
        List<Character> secondList = new ArrayList<>();
        if (first.length() != second.length()) {
            return -1;
        }
        for (int i = 0; i < first.length(); i++) {
            firstList.add(firstArray[i]);
            secondList.add(secondArray[i]);
        }
        for (int i = 0; i < first.length(); i++) {
            Collections.rotate(firstList, i);
            firstArray[i] = firstList.get(i);
            if (firstList.equals(secondList)) {
                return i;
            }
            Collections.rotate(firstList, -i);
        }
        return -1;
    }
}
