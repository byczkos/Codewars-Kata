
//        Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran), check if the
//        array contains three and two of the same values.
//
//        Examples
//        ["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
//        ["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
//        ["a", "a", "a", "a", "a"] ==> false // 5x "a"

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkThreeAndTwo(new char[]{'a','b','b','b','a'}));
        System.out.println(checkThreeAndTwo(new char[]{'c','c','b','a','c'}));
    }

    public static boolean checkThreeAndTwo(char[] chars) {
        int countA = 0, countB = 0, countC = 0;
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] == 'a') {
                countA++;
            } else if (chars[i] == 'b') {
                countB++;
            } else if (chars[i] == 'c') {
                countC++;
            }
        }
        if (countA == 3) {
            if (countB == 2 || countC == 2) {
                return true;
            }
        } else if (countB == 3) {
            if (countA == 2 || countC == 2) {
                return true;
            }
        } else if (countC == 3) {
            if (countA == 2 || countB == 2) {
                return true;
            }
        }
        return false;
    }
}