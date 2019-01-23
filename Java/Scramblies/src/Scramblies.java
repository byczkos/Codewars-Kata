
//    Complete the function scramble(str1, str2) that returns true if a portion of str1
//    characters can be rearranged to match str2, otherwise returns false.
//
//    Notes:
//
//    Only lower case letters will be used (a-z). No punctuation or digits will be included.
//    Performance needs to be considered
//    Examples
//    scramble('rkqodlw', 'world') ==> True
//    scramble('cedewaraaossoqqyt', 'codewars') ==> True
//    scramble('katas', 'steak') ==> False

import java.util.LinkedList;

public class Scramblies {

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world")); // true
        System.out.println(scramble("scriptjavx", "javascript")); // false
        System.out.println(scramble("scriptingjava", "javascript")); // true
        System.out.println(scramble("javscripts", "javascript")); // false
    }

    public static boolean scramble(String str1, String str2) {
        LinkedList<Character> linkedList = new LinkedList<Character>();
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        for (int i = 0; i < char1.length; i++) {
            linkedList.add(char1[i]);
        }
        for (int i = 0; i < char2.length; i++) {
            if (!linkedList.remove((Character) char2[i])) {
                return false;
            }
        }
        return true;
    }
}
