//        Given an array, find the int that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindOdd {

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 1, 1, 2, 2}));
    }

    public static int findIt(int[] A) {
        List<Integer> intList = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            intList.add(A[i]);
        }
        for (int i = 0; i < A.length; i++) {
            if (Collections.frequency(intList, intList.get(i)) % 2 != 0) {
                return intList.get(i);
            }
        }
        return -1;
    }
}