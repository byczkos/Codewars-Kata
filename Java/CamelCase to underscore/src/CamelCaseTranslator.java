//    You wrote all your unit test names in camelCase. But some of your colleagues have troubles reading these long test names.
//    So you make a compromise to switch to underscore separation.
//
//    To make these changes fast you wrote a class to translate a camelCase name into an underscore separated name.
//
//    Implement the ToUnderscore() method.
//
//    Example:
//
//    "ThisIsAUnitTest" => "This_Is_A_Unit_Test"
//
//    But of course there are always special cases...
//
//    You also have some calculation tests. Make sure the results don't get splitted by
//    underscores. So only add an underscore in front of the first number.
//
//    Also Some people already used underscore names in their tests. You don't want to
//    change them. But if they are not splitted correct you should adjust them.
//
//    Some of your colleagues mark their tests with a leading and trailing underscore. Don't remove this.
//
//    And of course you should handle empty strings to avoid unnecessary errors. Just return an empty string then.
//
//    Example:
//
//    "Calculate15Plus5Equals20" => "Calculate_15_Plus_5_Equals_20"
//
//    "This_Is_Already_Splitted_Correct" => "This_Is_Already_Splitted_Correct"
//
//    "ThisIs_Not_SplittedCorrect" => "This_Is_Not_Splitted_Correct"
//
//    "_UnderscoreMarked_Test_Name_" => _Underscore_Marked_Test_Name_"

//    Link to this Kata : https://www.codewars.com/kata/camelcase-to-underscore/train/java

public class CamelCaseTranslator {

    public static void main(String[] args) {
        System.out.println(CamelCaseTranslator.toUnderScore("Calculate15Plus5Equals20"));
        System.out.println(CamelCaseTranslator.toUnderScore("This_Is_Already_Splitted_Correct"));
        System.out.println(CamelCaseTranslator.toUnderScore("ThisIs_Not_SplittedCorrect"));
        System.out.println(CamelCaseTranslator.toUnderScore("_UnderscoreMarked_Test_Name_"));
        System.out.println(CamelCaseTranslator.toUnderScore("grvX[]<>H3Yo"));
    }

    public static String toUnderScore(String name) {
        StringBuilder builder = new StringBuilder();
        builder.append(name.charAt(0));
        for (int i = 1; i < name.length(); i++) {
            char current = name.charAt(i);
            char last = name.charAt(i - 1);
            if ((Character.isUpperCase(current) || (Character.isDigit(current) && !Character.isDigit(last)))
                    && last != '_'){
                builder.append("_");
            }
            builder.append(current);
        }
        return builder.toString();
    }
}
