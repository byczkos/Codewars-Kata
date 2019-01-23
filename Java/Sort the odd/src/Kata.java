//        You have an array of numbers.
//        Your task is to sort ascending odd numbers but even numbers must be on their places.
//
//        Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
//
//        Example
//
//        sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {

//    If you want check the solution, please uncomment 'for'  loop.
    public static void main(String[] args) {
        System.out.println(Kata.sortArray(new int[]{5,3,2,8,1,4}));
    }

    public static int[] sortArray(int[] array) {
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddList.add(array[i]);
            }
        }
        Collections.sort(oddList);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddList.get(j);
                j++;
            }
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        return array;
    }
}
