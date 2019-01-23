
//        Determine if the poker hand is flush
//
//        Your function will be passed a string array with 5 strings each representing a poker card in the format "5H" (5 of hearts)
//        meaning the value of the card followed by the initial of its suit (Hearts, Spades, Diamonds or Clubs). No jokers included
//
//        Your function should return true if the hand is flush meaning if the five cards are of the same suit
//
//        The possible card values are 1-10, after 10, we have J K and Q
//
//        Eg.
//
//        1S, 3S, 9S, KS, 4S  should return true
//
//        1D, 4S, 7H, KS, 10S  should return False.

public class Kata{

    // Validation
    public static void main(String[] args) {
        String[] name = new String[]{"QD", "4D", "10D", "KD", "5D"};
        System.out.println(CheckIfFlush(name));
    }

    // Solution
    public static boolean CheckIfFlush(String[] cards){
        String[] substringTable = new String[5];
        for (int i = 0; i < 5 ; i++) {
            if (cards[i].length() > 2) {
                substringTable[i] = cards[i].substring(2);
            } else {
                substringTable[i] = cards[i].substring(1);
            }
        }

        if (substringTable[0].equals(substringTable[1]) &&
                substringTable[0].equals(substringTable[2]) &&
                substringTable[0].equals(substringTable[3]) &&
                substringTable[0].equals(substringTable[4])) {
            return true;
        } else {
            return false;
        }
    }
}
