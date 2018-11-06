
//    Move the first letter of each word to the end of it, then add "ay" to the end of the word.
//    Leave punctuation marks untouched.
//
//    Examples
//    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//    pigIt('Hello world !');     // elloHay orldway !

//    URL: https://www.codewars.com/kata/simple-pig-latin/train/java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PigLatin {

//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
    }

    public static String pigIt(String str) {
        String[] array = str.split(" ");
        StringBuilder builder = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                list.add(array[i].charAt(j));
            }
            Collections.rotate(list, -1);
            for (int j = 0; j < list.size(); j++) {
                builder.append(list.get(j));
            }
            list.clear();
            builder.append("ay ");
        }
        builder.deleteCharAt(builder.lastIndexOf(" "));
        System.out.println(builder.charAt(builder.length() - 3));
        if (!Character.isAlphabetic(builder.charAt(builder.length() - 3))) {
            builder.delete(builder.length() - 2, builder.length());
        }
        return builder.toString();
    }
}
