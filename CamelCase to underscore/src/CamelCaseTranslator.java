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

import java.util.Arrays;
import java.util.List;

public class CamelCaseTranslator {

    public static void main(String[] args) {
        System.out.println(CamelCaseTranslator.toUnderScore("Calculate15Plus5Equals20"));
        System.out.println(CamelCaseTranslator.toUnderScore("This_Is_Already_Splitted_Correct"));
        System.out.println(CamelCaseTranslator.toUnderScore("ThisIs_Not_SplittedCorrect"));
        System.out.println(CamelCaseTranslator.toUnderScore("_UnderscoreMarked_Test_Name_"));
        System.out.println(CamelCaseTranslator.toUnderScore("grvX[]<>H3Yo"));
    }

//    this resolution doesn't work good now, problem is with randomUnitNameTests and simpleUnitNameTests
    public static String toUnderScore(String name) {
        Character[] specialSigns = {'[', ']', '>', '<', '_', '-'};
        List<Character> list = Arrays.asList(specialSigns);
        StringBuilder builder = new StringBuilder();
        builder.append(name.charAt(0));
        for (int i = 1; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i)) && !Character.isUpperCase(name.charAt(i - 1)) 
                    && !list.contains(name.charAt(i - 1))) {
                builder.append("_");
            } else if (Character.isDigit(name.charAt(i)) && !Character.isDigit(name.charAt(i - 1)) 
                    && !list.contains(name.charAt(i - 1))) {
                builder.append("_");
            } else if (list.contains(name.charAt(i)) && list.contains(name.charAt(i - 1))) {
                builder.append("_");
            }
            builder.append(name.charAt(i));
        }
        return builder.toString();
    }
}
