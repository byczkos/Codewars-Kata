
//    Given an array of strings, reverse them and their order in such way that their length stays the same as the length of the original inputs.
//
//    Example:
//    Input:  {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}
//    Output: {"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"}
//    Good luck!

//    URL: https://www.codewars.com/kata/ultimate-array-reverser/train/java

public class ArrayReverser {

    public static void main(String[] args) {
        reverse(new String[]{"I", "like", "big", "butts", "and", "I", "cannot", "lie!"});
    }
    
    public static String[] reverse(String[] a) {
        String[] reversedArray = new String[a.length];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            builder.append(a[i]);
        }
        builder.reverse().toString();
        int startIndex = 0;
        int endIndex = a[0].length();
        for (int i = 0; i < a.length - 1; i++) {
            reversedArray[i] = builder.substring(startIndex, endIndex);
            startIndex = endIndex;
            endIndex += a[i + 1].length();
        }
        reversedArray[a.length - 1] = builder.substring(startIndex, builder.length());
        return reversedArray;
    }
}
