//    Write a function that accepts a string, and returns true if it is in the form of a phone number. 
//    Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
//
//    Only worry about the following format:
//    (123) 456-7890 (don't forget the space after the close parentheses) 
//
//    Examples:
//
//    validPhoneNumber("(123) 456-7890")  =>  returns true
//    validPhoneNumber("(1111)555 2345")  => returns false
//    validPhoneNumber("(098) 123 4567")  => returns false

public class Kata {

    public static boolean validPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 14) {
            return false;
        } else {
            if (phoneNumber.charAt(0) == '(' && Character.isDigit(phoneNumber.charAt(1)) && Character.isDigit(phoneNumber.charAt(2))
                    && Character.isDigit(phoneNumber.charAt(3)) && phoneNumber.charAt(4) == ')' && Character.isWhitespace(phoneNumber.charAt(5))
                    && Character.isDigit(phoneNumber.charAt(6)) && Character.isDigit(phoneNumber.charAt(7)) && Character.isDigit(phoneNumber.charAt(8))
                    && phoneNumber.charAt(9) == '-' && Character.isDigit(phoneNumber.charAt(10)) && Character.isDigit(phoneNumber.charAt(11))
                    && Character.isDigit(phoneNumber.charAt(12)) && Character.isDigit(phoneNumber.charAt(13))) {
                return true;
            }
        }
        return false;
    }
}
