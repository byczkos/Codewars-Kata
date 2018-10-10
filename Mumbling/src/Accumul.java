
//    This time no story, no theory. The examples below show you how to write function accum:
//
//    Examples:
//
//    Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
//    Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//    Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
//    The parameter of accum is a string which includes only letters from a..z and A..Z.
public class Accumul {

//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(Accumul.accum("abcd"));
    }

    public static String accum(String s) {
        StringBuilder builder = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            builder.append(Character.toUpperCase(ch));
            for (int j = 0; j < i; j++) {
                builder.append(ch);
            }
            builder.append("-");
        }
        return builder.deleteCharAt(builder.lastIndexOf("-")).toString();
    }
}
