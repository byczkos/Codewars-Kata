//    Trolls are attacking your comment section!
//
//    A common way to deal with this situation is to remove all of the vowels from the trolls'
//    comments, neutralizing the threat.
//
//    Your task is to write a function that takes a string and return a new string with all
//    vowels removed.
//
//    For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//
//    Note: for this kata y isn't considered a vowel.

//    URL: https://www.codewars.com/kata/disemvowel-trolls/train/java

public class Troll {

//    ===check the solution ===
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    // This solution works good, but it's not optimal.
//    public static String disemvowel(String str) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != 'a' && str.charAt(i) != 'A' && str.charAt(i) != 'e' && str.charAt(i) != 'E' && str.charAt(i) != 'i' && str.charAt(i) != 'I'
//                    && str.charAt(i) != 'o' && str.charAt(i) != 'O' && str.charAt(i) != 'u' && str.charAt(i) != 'U') {
//                builder.append(str.charAt(i));
//            }
//        }
//        return builder.toString();
//    }
//    
    
//    This is the better solution.
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiou]", "");
    }
}
