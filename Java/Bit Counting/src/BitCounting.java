//    Write a function that takes an integer as input, and returns the number of bits that
//    are equal to one in the binary representation of that number. You can guarantee that
//    input is non-negative.
//
//    Example: The binary representation of 1234 is 10011010010, so the function should
//    return 5 in this case

public class BitCounting {
    
    
//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n) {
        String binaryRepresantation = Integer.toBinaryString(n);
        char[] binaryArray = binaryRepresantation.toCharArray();
        int counter = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == '1') {
                counter ++;
            }
        }
        return counter;
    }

}
