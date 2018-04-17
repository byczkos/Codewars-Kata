
//###Lucky number
//
//        Write a function to find if a number is lucky or not. If the sum of all digits is 0 or multiple of 9 then the number is lucky.
//
//        1892376 => 1+8+9+2+3+7+6 = 36. 36 is divisble by 9, hence number is lucky.
//
//        Function will return true for lucky numbers and false for others.

public class LuckyNumber {

    public static boolean isLucky(long n) {
        String stringNumber = Long.toString(n);
        String[] tableOfStringNumber = stringNumber.split("");
        int sum = 0;
        for (int i = 0; i < tableOfStringNumber.length; i++) {
            if (tableOfStringNumber[i].equals("-")) {
                sum = sum;
            } else {
                sum = sum + Integer.parseInt(tableOfStringNumber[i]);
            }
        }
        if (sum == 0 || sum % 9 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
