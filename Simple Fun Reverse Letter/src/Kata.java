
//    Task
//    Given a string str, reverse it omitting all non-alphabetic characters.
//
//    Example
//    For str = "krishan", the output should be "nahsirk".
//
//    For str = "ultr53o?n", the output should be "nortlu".
//
//    Input/Output
//    [input] string str
//
//    A string consists of lowercase latin letters, digits and symbols.
//
//    [output] a string
public class Kata {

    public static void main(String[] args) {
        System.out.println(reverseLetter("jakato567*melodia"));
    }
    
    public static String reverseLetter(final String str) {
        return new StringBuilder(str).reverse().toString().replaceAll("[^a-zA-Z]", "");
    }
}
