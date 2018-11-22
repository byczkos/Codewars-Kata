//    Write a function that accepts an array of 10 integers (between 0 and 9), that
//    returns a string of those numbers in the form of a phone number.
//
//    Example:
//    Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
//    The returned format must be correct in order to complete this challenge. 
//    Don't forget the space after the closing parentheses!

//    URL: https://www.codewars.com/kata/create-phone-number/train/java

public class Kata {

    public static String createPhoneNumber(int[] numbers) {
        int i = 0;
        StringBuilder builder = new StringBuilder();
        if (numbers.length != 10) {
            return "";
        } else {
            builder.append("(");
            for (; i < 3; i++) {
                builder.append(numbers[i]);
            }
            builder.append(") ");
            for (; i < 6; i++) {
                builder.append(numbers[i]);
            }
            builder.append("-");
            for (; i < 10; i++) {
                builder.append(numbers[i]);
            }
            return builder.toString();
        }
    }
}
