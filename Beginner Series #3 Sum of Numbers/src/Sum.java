//    Given two integers a and b, which can be positive or negative, find the sum
//    of all the numbers between including them too and return it. If the two numbers are equal return a or b.
//
//    Note: a and b are not ordered!
//
//    Examples
//    GetSum(1, 0) == 1   // 1 + 0 = 1
//    GetSum(1, 2) == 3   // 1 + 2 = 3
//    GetSum(0, 1) == 1   // 0 + 1 = 1
//    GetSum(1, 1) == 1   // 1 Since both are same
//    GetSum(-1, 0) == -1 // -1 + 0 = -1
//    GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2

//    URL: https://www.codewars.com/kata/beginner-series-number-3-sum-of-numbers/train/java

public class Sum {
    
//    === check the solution ===
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.getSum(1, 0));
        System.out.println(sum.getSum(-1, 0));
        System.out.println(sum.getSum(-1, 2));
    }

    public int getSum(int a, int b) {
        int sum = 0;
        if (a == b) {
            return a;
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
