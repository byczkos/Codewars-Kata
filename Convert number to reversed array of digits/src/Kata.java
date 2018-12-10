//    Convert number to reversed array of digits
//    Given a random number:
//
//    C#: long;
//    C++: unsigned long;
//    You have to return the digits of this number within an array in reverse order.
//
//    Example:
//    348597 => [7,9,5,8,4,3]

//    URL: https://www.codewars.com/kata/convert-number-to-reversed-array-of-digits/train/java

public class Kata {

    //  check the solution
    public static void main(String[] args) {
        System.out.println(Kata.digitize(123456));
    }
    
    public static int[] digitize(long n) {
        StringBuilder builder = new StringBuilder();
        builder.append(Long.toString(n)).reverse();
        int[] reversedTable = new int[Long.toString(n).length()];
        for (int i = 0; i < reversedTable.length; i++) {
            reversedTable[i] = Integer.parseInt(builder.toString().substring(i, i + 1));
        }
        return reversedTable;
    }
}
