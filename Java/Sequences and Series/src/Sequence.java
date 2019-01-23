//    Have a look at the following numbers.
//
//     n | score
//    ---+-------
//     1 |  50
//     2 |  150
//     3 |  300
//     4 |  500
//     5 |  750
//    Can you find a pattern in it? If so, then write a function 
//    getScore(n)/get_score(n)/GetScore(n) which returns the score for any positive number n:
//
//    int getScore(1) = return 50;
//    int getScore(2) = return 150;
//    int getScore(3) = return 300;
//    int getScore(4) = return 500;
//    int getScore(5) = return 750;

public class Sequence {

    public static void main(String[] args) {
        System.out.println(getScore(1));
        System.out.println(getScore(2));
        System.out.println(getScore(3));
        System.out.println(getScore(4));
        System.out.println(getScore(5));
    }

    public static long getScore(long n) {
        return n * 50 + (n - 1) * 25 * n;
    }
}
