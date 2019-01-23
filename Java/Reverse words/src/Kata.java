
//    Complete the function that accepts a string parameter, and reverses each word in the string. 
//    All spaces in the string should be retained.
//
//    Examples
//    "This is an example!" ==> "sihT si na !elpmaxe"
//    "double  spaces"      ==> "elbuod  secaps"
class Kata {

    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));
        System.out.println(reverseWords("double  spaces"));
    }

    public static String reverseWords(final String original) {
        String[] tableOfString = original.split(" ");
        StringBuilder builder = new StringBuilder();
        if (tableOfString.length > 0) {
        for (int i = 0; i < tableOfString.length; i++) {
                builder.append(new StringBuilder(tableOfString[i]).reverse().toString());
                builder.append(" ");
            }
        } else {
            return original;
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
