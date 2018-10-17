
//    Write a method, isCircleSorted(int[] A) (Java, JavaScript), or Array#circularly_sorted?
//    (Ruby) that determines if A is circularly sorted. An Array is circularly sorted if the
//    elements are sorted in ascending order, but displaced, or rotated, by any number of steps.
//
//    For Example:
//
//    // True:
//    isCircleSorted([2,3,4,5,0,1]);
//    isCircleSorted([4,5,6,9,1]);
//    isCircleSorted([10,11,6,7,9]);
//    isCircleSorted([1,2,3,4,5]);
//    isCircleSorted([5,7,43,987,-9,0]);
//
//
//    // False:
//    isCircleSorted([4,1,2,5]);
//    isCircleSorted([8,7,6,5,4,3]);
//    isCircleSorted([6,7,4,8]);
//    isCircleSorted([7,6,5,4,3,2,1]);

// URL:   https://www.codewars.com/kata/circularly-sorted-array/train/java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CircleSorted {

//   === check the solution ===
    public static void main(String[] args) {
        CircleSorted circleSorted = new CircleSorted();
        System.out.println(circleSorted.isCircleSorted(new int[]{3,0,1,2}));
        System.out.println(circleSorted.isCircleSorted(new int[]{1, 2, 5, 8, 0}));
        System.out.println(circleSorted.isCircleSorted(new int[]{8, 2, 3, 4, 7}));
    }

    // something is wrong with trueTest
    
    public boolean isCircleSorted(int[] a) {
        List<Integer> rotatedList = new ArrayList<>();
        int[] sortedArray = new int[a.length];
        int[] rotatedArray = new int[a.length];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            builder.append(a[i]);
            rotatedList.add(a[i]);
            sortedArray[i] = a[i];
        }
        Collections.rotate(rotatedList, a.length - builder.lastIndexOf(Collections.min(rotatedList).toString()));
        Arrays.sort(sortedArray);
        for (int i = 0; i < a.length; i++) {
            rotatedArray[i] = rotatedList.get(i);
        }
        if (Arrays.equals(rotatedArray, sortedArray)) {
            return true;
        }
        return false;
    }
}
