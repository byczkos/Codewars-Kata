
//    The goal of this exercise is to convert a string to a new string where
//    each character in the new string is '(' if that character appears only
//    once in the original string, or ')' if that character appears more than
//    once in the original string. Ignore capitalization when determining if a
//    character is a duplicate.
//
//    Examples:
//
//    "din" => "((("
//
//    "recede" => "()()()"
//
//    "Success" => ")())())"
//
//    "(( @" => "))(("
//
//
//    Notes:
//
//    Assertion messages may be unclear about what they display in some languages.
//    If you read "...It Should encode XXX", the "XXX" is actually the expected result,
//    not the input! (these languages are locked so that's not possible to correct it).
//    URL: https://www.codewars.com/kata/duplicate-encoder/train/java

public class DuplicateEncoder {

    static String encode(String word) {
        String wordToLowerCase = word.toLowerCase();
        String result = "";
        for (int i = 0; i < wordToLowerCase.length(); ++i) {
            char temporaryChar = wordToLowerCase.charAt(i);
            if (wordToLowerCase.lastIndexOf(temporaryChar) == wordToLowerCase.indexOf(temporaryChar)) {
                result += "(";
            } else {
                result += ")";
            };
        }
        return result;
    }
}
