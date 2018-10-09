
//    Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java)
//    for strings. All words must have their first letter capitalized without spaces.
//
//    For instance:
//
//    camelCase("hello case"); // => "HelloCase"
//    camelCase("camel case word"); // => "CamelCaseWord"
//    Don't forget to rate this kata! Thanks :)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(Solution.camelCase("how can i use java stream"));
        System.out.println(Solution.camelCase("how    can i use java stream"));
        System.out.println(Solution.camelCase(" camel case word"));
    }

    public static String camelCase(String str) {
        if (str.isEmpty()) {
            return "";
        }
        List<String> listOfStrings = Arrays.asList(str.split(" "));
        String[] tableOfStrings = str.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < tableOfStrings.length; i++) {
            list.add(tableOfStrings[i]);
        }
        // deleting all double spaces etc.
        list.removeAll(Collections.singleton(null));
        list.removeAll(Collections.singleton(""));
        String[] arrayOfStringsWihoutSpaces = list.toArray(new String[list.size()]);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arrayOfStringsWihoutSpaces.length; i++) {
            String firstLetterOfName = arrayOfStringsWihoutSpaces[i].substring(0, 1).toUpperCase();
            String theRestOfName = arrayOfStringsWihoutSpaces[i].substring(1);
            builder.append(firstLetterOfName);
            builder.append(theRestOfName);
        }
        return builder.toString();
    }

}
