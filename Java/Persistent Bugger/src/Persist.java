//    Write a function, persistence, that takes in a positive parameter num and returns
//    its multiplicative persistence, which is the number of times you must multiply the
//    digits in num until you reach a single digit.
//
//    For example:
//
//     persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
//                          // and 4 has only one digit
//
//     persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
//                           // 1*2*6 = 12, and finally 1*2 = 2
//
//     persistence(4) == 0 // because 4 is already a one-digit number

//     URL: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/solutions/java

class Persist {

    public static int persistence(long n) {
        Integer multiflification = 1;
        Integer result = Integer.parseInt(Long.toString(n));
        int counter = 0;
        if (Long.toString(n).length() == 1) {
            return 0;
        }
        counter = 0;
        while (result.toString().length() > 1) {
            for (int i = 0; i < Long.toString(result).length(); i++) {
                multiflification *= Integer.parseInt(Character.toString(Integer.toString(result).charAt(i)));
            }
            result = multiflification;
            multiflification = 1;
            counter++;
        }
        return counter;
    }
}
