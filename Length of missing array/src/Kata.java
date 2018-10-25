
//    You get an array of arrays.
//    If you sort the arrays by their length, you will see, that their length-values are consecutive.
//    But one array is missing!
//
//
//    You have to write a method, that return the length of the missing array.
//
//    Example:
//    [[1, 2], [4, 5, 1, 1], [1], [5, 6, 7, 8, 9]] --> 3
//
//
//    If the array of arrays is null/nil or empty, the method should return 0.
//
//    When an array in the array is null or empty, the method should return 0 too!
//    There will always be a missing element and its length will be always between the given arrays. 
//
//    Have fun coding it and please don't forget to vote and rank this kata! :-)
//
//    I have created other katas. Have a look if you like coding and challenges.
//    URL: https://www.codewars.com/kata/length-of-missing-array/train/java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {

    public static void main(String[] args) {
        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{1, 2}, new Object[]{4, 5, 1, 1}, new Object[]{1}, new Object[]{5, 6, 7, 8, 9}}));
        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{5, 2, 9}, new Object[]{4, 5, 1, 1}, new Object[]{1}, new Object[]{5, 6, 7, 8, 9}}));
        System.out.println(getLengthOfMissingArray(new Object[][]{}));
        System.out.println(getLengthOfMissingArray(new Object[][]{new Object[]{null}, new Object[]{null, null, null}}));
    }

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (arrayOfArrays == null) {
            return 0;
        }
        List<Integer> lengthList = new ArrayList<>();
        for (int i = 0; i < arrayOfArrays.length; i++) {
            if (arrayOfArrays[i] == null) {
                return 0;
            }
            lengthList.add(arrayOfArrays[i].length);
        }
        Collections.sort(lengthList);
        for (int i = 0; i < lengthList.size(); i++) {
            if (lengthList.get(i) == null || lengthList.get(i) == 0) {
                return 0;
            }
            if (lengthList.get(i) != lengthList.get(i + 1) - 1) {
                return lengthList.get(i) + 1;
            }
        }
        return 0;
    }
}
