
//    In this kata, you must create a digital root function.
//
//    A digital root is the recursive sum of all the digits in a number.
//    Given n, take the sum of the digits of n. If that value has two digits,
//    continue reducing in this way until a single-digit number is produced. 
//    This is only applicable to the natural numbers.
//
//    Here's how it works (Ruby example given):
//
//    digital_root(16)
//    => 1 + 6
//    => 7
//
//    digital_root(942)
//    => 9 + 4 + 2
//    => 15 ...
//    => 1 + 5
//    => 6
//
//    digital_root(132189)
//    => 1 + 3 + 2 + 1 + 8 + 9
//    => 24 ...
//    => 2 + 4
//    => 6
//
//    digital_root(493193)
//    => 4 + 9 + 3 + 1 + 9 + 3
//    => 29 ...
//    => 2 + 9
//    => 11 ...
//    => 1 + 1
//    => 2

// URL: https://www.codewars.com/kata/sum-of-digits-slash-digital-root/train/java 

public class DRoot {
    
//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(132189));
        System.out.println(digital_root(493193));
    }

    public static int digital_root(int n) {
        int sumOfDigits = 0;
        String number = String.valueOf(n);
        while (number.length() > 1) {
            sumOfDigits = 0;
            for (int i = 0; i < number.length(); i++) {
                sumOfDigits += Integer.parseInt(Character.toString(number.charAt(i)));
            }
            number = String.valueOf(sumOfDigits);
        }
        return sumOfDigits;
    }
}
