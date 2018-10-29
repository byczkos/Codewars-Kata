//    Return the number (count) of vowels in the given string.
//
//    We will consider a, e, i, o, and u as vowels for this Kata.
//
//    The input string will only consist of lower case letters and/or spaces.

public class Vowels {

//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(getCount("how old are you"));
    }
    
    public static int getCount(String str) {
        String vowels = "aeiou";
        int vowelsCount = 0;
        if (str.isEmpty()) {
            return 0;
        }
        String[] inputStringArray = str.split("");
        for (int i = 0; i < inputStringArray.length; i++) {
            if (vowels.contains(inputStringArray[i])) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
