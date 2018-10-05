//    Write a class function named repeat() that takes two arguments (a string and a long integer),
//    and returns a new string where the input string is repeated that many times. For example:
//
//    Repeater.repeat("a", 5)
//    should return
//
//    "aaaaa"

public class Repeater {

    public static void main(String[] args) {
        System.out.println(repeat("ala", 3));
    }

    public static String repeat(String string, long n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(string);
        }
        return builder.toString();
    }
}
