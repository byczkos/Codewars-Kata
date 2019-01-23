
//Complete the method which accepts an array of integers, and returns one of the following:
//
//        "yes, ascending" - if the numbers in the array are sorted in an ascending order
//        "yes, descending" - if the numbers in the array are sorted in a descending order
//        "no" - otherwise
//        You can assume the array will always be valid, and there will always be one correct answer.

import java.util.Arrays;
import java.util.Collections;

class Solution {

    public static String isSortedAndHow(int[] array) {
        Integer[] integerArray = Arrays.stream(array).boxed().toArray( Integer[]::new );
        Integer[] descendingArray = new Integer[array.length];
        for (int i = 0; i < array.length ; i++) {
            descendingArray[i] = integerArray[i];
        }
        Arrays.sort(descendingArray, Collections.reverseOrder());
        Integer[] ascendingArray = new Integer[array.length];
        for (int i = 0; i < array.length ; i++) {
            ascendingArray[i] = integerArray[i];
        }
        Arrays.sort(ascendingArray);
        if (Arrays.equals(integerArray, descendingArray)) {
            return "yes, descending";
        } else if (Arrays.equals(integerArray, ascendingArray)) {
            return "yes, ascending";
        } else {
            return "no";
        }
    }
}