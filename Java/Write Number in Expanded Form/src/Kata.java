//    Write Number in Expanded Form
//    You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//    Kata.expandedForm(12); # Should return "10 + 2"
//    Kata.expandedForm(42); # Should return "40 + 2"
//    Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//    NOTE: All numbers will be whole numbers greater than 0.

public class Kata {

//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(expandedForm(90000));
        System.out.println(expandedForm(1234));
        System.out.println(expandedForm(12034));
        System.out.println(expandedForm(12030));
    }

    public static String expandedForm(int num) {
        StringBuilder builder = new StringBuilder();
        String stringNumber = Integer.toString(num);
        char[] numberArray = stringNumber.toCharArray();
        for (int i = 0; i < numberArray.length; i++) {
            Double number = Integer.parseInt(String.valueOf(numberArray[i])) * Math.pow(10, numberArray.length - i - 1);
            if (numberArray[i] != '0') {
                builder.append(number.intValue());
                if (i < numberArray.length - 1) {
                    builder.append(" + ");
                }
            }
        }
//      this if delete String " + " at the end if the last digit is '0'
        if (numberArray[numberArray.length - 1] == '0') {
            builder.delete(builder.length() - 3, builder.length());
        }
        return builder.toString();
    }
}
