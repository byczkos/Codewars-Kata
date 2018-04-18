
//At a job interview, you are challenged to write an algorithm to check if a given string, s, can be formed from two other strings, part1 and part2.
//
//        The restriction is that the characters in part1 and part2 are in the same order as in s.
//
//        The interviewer gives you the following example and tells you to figure out the rest from the given test cases.
//
//        For example:
//
//        'codewars' is a merge from 'cdw' and 'oears':
//
//        s:  c o d e w a r s   = codewars
//        part1:  c   d   w         = cdw
//        part2:    o   e   a r s   = oears

import java.util.Arrays;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        char[] string = s.toCharArray();
        char[] partOne = part1.toCharArray();
        char[] partTwo = part2.toCharArray();
        if (part1.equals(part2) & !s.isEmpty()) return false;
        int l = string.length, l1 = partOne.length, l2 = partTwo.length;
        int n = 0, m =0;
        if (l == l1 + l2) {
            for (int i = 0; i < l ; i++) {
                if (n < l1 && string[i] == partOne[n]) {
                    n++;
                }
                if (m < l2 && string[i] == partTwo[m]) {
                    m++;
                }
            }
            if (l == n + m) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}