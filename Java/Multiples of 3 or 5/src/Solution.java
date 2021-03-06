
//    If we list all the natural numbers below 10 that are multiples of 3 or 5,
//    we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
//    Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
//
//    Note: If the number is a multiple of both 3 and 5, only count it once.
public class Solution {

//    === check the solution ===
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }

    public int solution(int number) {
        int sum = 0;
        int correction = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            if (i % 5 == 0) {
                sum += i;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                correction += i;
            }
        }
        return sum - correction;
    }
}
