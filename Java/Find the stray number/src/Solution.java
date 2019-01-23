
//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//
//        Complete the method which accepts such an array, and returns that single different number.
//
//        The input array will always be valid! (odd-length >= 3)
//
//        Examples
//        [1, 1, 2] ==> 2
//        [17, 17, 3, 17, 17, 17, 17] ==> 3

import java.util.Arrays;

class Solution {

    // Verification
    public static void main(String[] args) {
        System.out.println(stray(new int[]{4,4,4,4,4,2,4,4,4}));
        System.out.println(stray(new int[]{4,4,4,4,4,99,4,4,4}));
        System.out.println(stray(new int[]{4,4,4,4,4,5,4,4,4}));
        System.out.println(stray(new int[]{77,4,4,4,4,4,4,4,4}));
        System.out.println(stray(new int[]{4,4,4,4,4,4,4,4,88}));
    }

    static int stray(int[] numbers) {
        int uniqueNumber = numbers[0];
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[0] == numbers[1]) {
                return numbers[numbers.length - 1];
            }
        }
        return numbers[0];
    }
}