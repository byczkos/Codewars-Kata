
//    Given an array of integers your solution should find the smallest integer.
//
//    For example:
//
//    Given [34, 15, 88, 2] your solution will return 2
//    Given [34, -345, -1, 100] your solution will return -345
//    You can assume, for the purpose of this kata, that the supplied array will not be empty.

//    URL: https://www.codewars.com/kata/find-the-smallest-integer-in-the-array/train/java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            list.add(args[i]);
        }
        return Collections.min(list);
    }
}
