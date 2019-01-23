
//    Write a function that takes in a string of one or more words, and returns the same string,
//    but with all five or more letter words reversed (Just like the name of this Kata). 
//    Strings passed in will consist of only letters and spaces. Spaces will be included only 
//    when more than one word is present.
//    Examples:
//    spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
//    spinWords( "This is a test") => returns "This is a test" 
//    spinWords( "This is another test" )=> returns "This is rehtona test"

import java.util.Arrays;
import java.util.List;

public class SpinWords {

//   ==== check the solution ====
    public static void main(String[] args) {
        SpinWords spinWords = new SpinWords();
        System.out.println(spinWords.spinWords("Hey fellow warriors"));
        System.out.println(spinWords.spinWords("This is a test"));
        System.out.println(spinWords.spinWords("This is another test"));
    }

    public String spinWords(String sentence) {
        StringBuilder builder = new StringBuilder();
        List<String> list = Arrays.asList(sentence.split(" "));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() >= 5) {
                builder.append(new StringBuilder(list.get(i)).reverse().toString());
                builder.append(" ");
            } else {
                builder.append(list.get(i));
                builder.append(" ");
            }
        }
        return builder.deleteCharAt(builder.lastIndexOf(" ")).toString();
    }
}
