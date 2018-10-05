
//    Simple, given a string of words, return the length of the shortest word(s).
//
//    String will never be empty and you do not need to account for different data types.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
        
    public static void main(String[] args) {
        System.out.println(findShort("Temporary unit"));
    }
    
    public static int findShort(String s) {
        String[] tableOfString = s.split(" ");
        List<Integer> lengths = new ArrayList<>();
        for (int i = 0; i < tableOfString.length; i++) {
            lengths.add(tableOfString[i].length());
        }
        Collections.sort(lengths);
        return lengths.get(0);
    }
}
