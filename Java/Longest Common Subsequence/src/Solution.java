
//    Write a function called LCS that accepts two sequences and returns the longest subsequence common to the passed in sequences.
//
//    Subsequence
//    A subsequence is different from a substring. The terms of a subsequence need not be consecutive terms of the original sequence.
//
//    Example subsequence
//    Subsequences of "abc" = "a", "b", "c", "ab", "ac", "bc" and "abc".
//
//    LCS examples
//    Solution.lcs("abcdef", "abc") => returns "abc"
//    Solution.lcs("abcdef", "acf") => returns "acf"
//    Solution.lcs("132535365", "123456789") => returns "12356"
//    Notes
//    Both arguments will be strings
//    Return value must be a string
//    Return an empty string if there exists no common subsequence
//    Both arguments will have one or more characters (in JavaScript)
//    All tests will only have a single longest common subsequence. Don't worry about cases such as LCS( "1234", "3412" ),
//    which would have two possible longest common subsequences: "12" and "34".
//    Note that the Haskell variant will use randomized testing, but any longest common subsequence will be valid.
//
//    Note that the OCaml variant is using generic lists instead of strings, and will also have randomized tests 
//    (any longest common subsequence will be valid).

public class Solution {
    
//  ===  check the solution === 
    public static void main(String[] args) {
        System.out.println(lcs("abcdef", "abc"));
        System.out.println(lcs("abcdef", "acf"));
        System.out.println(lcs("132535365", "123456789"));
        System.out.println(lcs("a", "b"));
    }

    // I think that the problem is with repeated chars
    public static String lcs(String x, String y) {
        if (x.isEmpty() || y.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        String[] tableOfSecondString = y.split("");
        for (int i = 0; i < tableOfSecondString.length; i++) {
            if (x.contains(tableOfSecondString[i])) {
                builder.append(tableOfSecondString[i]);
            }
        }
        return builder.toString();
    }
}
