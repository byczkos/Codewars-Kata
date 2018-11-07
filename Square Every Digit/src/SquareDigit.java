//    Welcome. In this kata, you are asked to square every digit of a number.
//
//    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//    Note: The function accepts an integer and returns an integer

//    URL: https://www.codewars.com/kata/square-every-digit/train/java

public class SquareDigit {

    public int squareDigits(int n) {
        StringBuilder builder = new StringBuilder();
        String stringNumber = Integer.toString(n);
        for (int i = 0; i < stringNumber.length(); i++) {
            int result = Integer.parseInt(Character.toString(stringNumber.charAt(i))) *
                    Integer.parseInt(Character.toString(stringNumber.charAt(i)));
            builder.append(result);
        }
        return Integer.parseInt(builder.toString());
    }
}
