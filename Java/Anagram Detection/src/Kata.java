
//An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//
//        Note: anagrams are case insensitive
//
//        Complete the function to return true if the two arguments given are anagrams of theeach other; return false otherwise.
//
//        Examples
//        "foefet" is an anagram of "toffee"
//
//        "Buckethead" is an anagram of "DeathCubeK"


import java.util.Arrays;

public class Kata {

    public static boolean isAnagram(String test, String original) {
        if (test.length() == original.length()) {
            char[] testCharArray = test.toLowerCase().toCharArray();
            char[] originalCharArray = original.toLowerCase().toCharArray();
            Arrays.sort(testCharArray);
            Arrays.sort(originalCharArray);
            if (Arrays.equals(testCharArray,originalCharArray)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}