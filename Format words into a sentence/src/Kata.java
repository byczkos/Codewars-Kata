
//        Complete the method so that it formats the words into a single comma separated value. The last word should be separated by the word 'and'
//        instead of a comma. The method takes in an array of strings and returns a single formatted string. Empty string values should be ignored.
//        Empty arrays or null/nil values being passed into the method should result in an empty string being returned.
//
//        Kata.formatWords(new String[] {"ninja", "samurai", "ronin"}) => "ninja, samurai and ronin"
//        Kata.formatWords(new String[] {"ninja", "", "ronin"}) => "ninja and ronin"
//        Kata.formatWords(new String[] {}) => ""

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    // Validation
    public static void main(String[] args) {
        System.out.println(formatWords(new String[] {"ninja", "samurai", "ronin"}));
        System.out.println(formatWords(new String[] {"ninja"}));
        System.out.println(formatWords(new String[] {"ninja", "", "ronin"}));
        System.out.println(formatWords(new String[] {"one", "two", "three", "four"}));
        System.out.println(formatWords(new String[] {"", "", "three"}));
        System.out.println(formatWords(null));
    }


    // Solution
    public static String formatWords(String[] words) {
        if (words == null || words.length < 1) {
            return "";
        }
        List<String> listOfStringWithoutEmptyString = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < words.length ; i++) {
            listOfStringWithoutEmptyString.add(words[i]);
            if (!listOfStringWithoutEmptyString.isEmpty() && !listOfStringWithoutEmptyString.equals("") && listOfStringWithoutEmptyString != null) {
                num++;
            }
        }
        listOfStringWithoutEmptyString.removeAll(Arrays.asList("", null));
        String[] newWords = new String[listOfStringWithoutEmptyString.size()];
        int j = 0;
        for (int i = 0; i < listOfStringWithoutEmptyString.size(); i++) {
            if (!listOfStringWithoutEmptyString.isEmpty() || listOfStringWithoutEmptyString != null || !listOfStringWithoutEmptyString.equals("")) {
                newWords[j] = listOfStringWithoutEmptyString.get(i);
                j++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < newWords.length ; i++) {
            if (i < newWords.length - 2) {
                stringBuilder.append(newWords[i]);
                stringBuilder.append(", ");
            } else if (i == newWords.length - 2) {
                stringBuilder.append(newWords[i]);
                stringBuilder.append(" and ");
            } else if (i == newWords.length -1) {
                stringBuilder.append(newWords[i]);
            }
        }
        return stringBuilder.toString();
    }
}