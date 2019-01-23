
//Complete the solution so that it reverses the string value passed into it.
//        Kata.solution("world") //return "dlrow"

public class Kata {

    public static String solution(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            stringBuilder.append(charArray[i]);
        }
        stringBuilder.reverse();
        String reverseString = stringBuilder.toString();
        return reverseString;
    }
}