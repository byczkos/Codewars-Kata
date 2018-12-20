
//        You are given an array strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
//
//        #Example: longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
//
//        n being the length of the string array, if n = 0 or k > n or k <= 0 return "".


import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestConsec {

//    check the solution
    public static void main(String[] args) {
        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        System.out.println(longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv", "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
        System.out.println(longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
    }

    public static String longestConsec(String[] strarr, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        } else {
            for (int i = 0; i < strarr.length - k + 1; i++) {
                for (int j = 0; j < k; j++) {
                    sum += strarr[i + j].length();
                    map.put(i, sum);
                }
                sum = 0;
            }
            int indeksMaxValue = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
            for (int i = indeksMaxValue; i < indeksMaxValue + k; i++) {
                builder.append(strarr[i]);
            }
        }
        return builder.toString();
    }
}
