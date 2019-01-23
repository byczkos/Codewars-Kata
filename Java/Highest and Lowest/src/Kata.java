
//    In this little assignment you are given a string of space separated numbers, 
//    and have to return the highest and lowest number.
//
//    Example:
//
//    HighAndLow("1 2 3 4 5") // return "5 1"
//    HighAndLow("1 2 -3 4 5") // return "5 -3"
//    HighAndLow("1 9 3 4 -5") // return "9 -5"
//    Notes:
//
//    All numbers are valid Int32, no need to validate them.
//    There will always be at least one number in the input string.
//    Output string must be two numbers separated by a single space, and highest number is first.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    
//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(HighAndLow("1 6 -6 3"));
    }

    public static String HighAndLow(String numbers) {
        String[] splitArray = numbers.split(" ");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < splitArray.length; i++) {
            integerList.add(Integer.parseInt(splitArray[i]));
        }
        return Collections.max(integerList) + " " + Collections.min(integerList);
    }
}
