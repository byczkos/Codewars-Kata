
//  Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order.
//  Essentially, rearrange the digits to create the highest possible number.
//
//        Examples:
//        Input: 21445 Output: 54421
//
//        Input: 145263 Output: 654321
//
//        Input: 1254859723 Output: 9875543221

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    //verification
    public static void main(String[] args) {
        System.out.println(sortDesc(12345));
    }

    public static int sortDesc(final int num) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder.append(num);
        String[] tableOfString = stringBuilder.toString().split("");
        Integer[] tableOfNumber = new Integer[tableOfString.length];
        for (int i = 0; i < tableOfString.length ; i++) {
            tableOfNumber[i] = Integer.parseInt(tableOfString[i]);
        }
        Arrays.sort(tableOfNumber, Collections.reverseOrder());
        for (int i = 0; i < tableOfNumber.length ; i++) {
            stringBuilder1.append(tableOfNumber[i]);
        }
        return Integer.parseInt(stringBuilder1.toString());
    }
}
