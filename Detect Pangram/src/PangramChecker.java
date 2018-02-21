import java.util.*;
import java.util.List;


// A pangram is a sentence that contains every single letter of the alphabet at least once.
// For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
// because it uses the letters A-Z at least once (case is irrelevant).
//
// Given a string, detect whether or not it is a pangram.
// Return True if it is, False if not. Ignore numbers and punctuation.

public class PangramChecker {

    public boolean check(String sentence){
        char[] sentenceCharArray = sentence.toLowerCase().toCharArray();
        List<Character> characterList = new ArrayList<Character>();
        for (int i = 0; i< sentenceCharArray.length; i++){
            if(sentenceCharArray[i] >= 97 && sentenceCharArray[i] <= 122)
                characterList.add(sentenceCharArray[i]);
        }
        int number = (int) characterList.stream().distinct().count();
        if(number == 26) {
            return true;
        } else {
            return false;
        }
    }
}