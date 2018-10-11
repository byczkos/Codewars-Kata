
import java.util.Arrays;
import java.util.Comparator;

//    #Srot the inner ctnnoet in dsnnieedcg oredr
//
//    You have to sort the inner content of every word of a string in descending order.
//    The inner content is the content of a word without first and the last char.
//
//    Some examples:
//
//    "sort the inner content in descending order" -> "srot the inner ctonnet in dsnnieedcg oredr"
//    "wait for me" -> "wiat for me"
//    "this kata is easy" -> "tihs ktaa is esay"
//    The string will never be null and will never be empty.
//    It will contain only lowercase-letters and whitespaces.
//
//    In C++ the string is always 0-terminated. 
//
//
//    Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//    I have also created other katas. Take a look if you enjoyed this kata!
public class Kata {

//   === check the solution ===
    public static void main(String[] args) {
        System.out.println(Kata.sortTheInnerContent("wait for me"));
        System.out.println(Kata.sortTheInnerContent("sort the inner content in descending order"));
    }

//    === alphabetic sorting with descending order without first and last letter ===
    public static String sortTheInnerContent(String words) {
        if (words.length() < 1) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        String[] tableOfStrings = words.split(" ");
        for (int i = 0; i < tableOfStrings.length; i++) {
            char[] tableOfChar = tableOfStrings[i].toCharArray();
            char[] firstAndLastLetter = {tableOfChar[0], tableOfChar[tableOfChar.length - 1]};
            if (tableOfChar.length > 2) {
                Character[] tableOfCharacters = new Character[tableOfChar.length - 2];
                for (int j = 1; j < tableOfStrings[i].length() - 1; j++) {
                    tableOfCharacters[j - 1] = Character.valueOf(tableOfChar[j]);
                }
                Arrays.sort(tableOfCharacters, new Comparator<Character>() {
                    @Override
                    public int compare(Character o1, Character o2) {
                        return o2.compareTo(o1);
                    }
                });
                tableOfChar[0] = firstAndLastLetter[0];
                tableOfChar[tableOfChar.length - 1] = firstAndLastLetter[1];

                for (int n = 1; n < tableOfStrings[i].length() - 1; n++) {
                    tableOfChar[n] = tableOfCharacters[n - 1];
                }
            }
            builder.append(tableOfChar);
            builder.append(" ");
        }
        return builder.deleteCharAt(builder.lastIndexOf(" ")).toString();
    }

//    === a better solution ===
//        public static String sortTheInnerContent(String words) {
//            return Arrays.asList(words.split(" ")).stream()
//                    .map(word -> word.length() < 3 ? word : word.charAt(0) + sortChars(word) + word.charAt(word.length() - 1))
//                    .collect(Collectors.joining(" "));
//        }
//
//        public static String sortChars(String word) {
//            String[] chars = word.substring(1, word.length() - 1).split("");
//            Arrays.sort(chars, Collections.reverseOrder());
//            return String.join("", chars);
//        }

}
