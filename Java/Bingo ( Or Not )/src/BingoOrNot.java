
//    For this game of BINGO, you will receive a single array of 10 numbers from 1 to 26 as an input. Duplicate numbers within the array are possible.
//
//    Each number corresponds to their alphabetical order letter (e.g. 1 = A. 2 = B, etc). Write a function where you will win the game if your
//    numbers can spell "BINGO". They do not need to be in the right order in the input array). Otherwise you will lose. Your outputs
//    should be "WIN" or "LOSE" respectively.


//    URL: https://www.codewars.com/kata/bingo-or-not/train/java

import java.util.ArrayList;
import java.util.List;

public class BingoOrNot {
    public static String bingo(int[] numberArray){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberArray.length; i++) {
            list.add(numberArray[i]);
        }
        if (list.contains(2) && list.contains(9) && list.contains(14) && list.contains(7) && list.contains(15)) {
            return "WIN";
        } 
        return "LOSE";
    }
}
