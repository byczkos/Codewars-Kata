
//    Implement a method that accepts 3 integer values a, b, c. The method should
//    return true if a triangle can be built with the sides of given length and false
//    in any other case.
//
//    (In this case, all triangles must have surface greater than 0 to be accepted).

//    URL: https://www.codewars.com/kata/is-this-a-triangle/train/java

import java.util.Arrays;

class TriangleTester {

    public static boolean isTriangle(int a, int b, int c) {
        int[] array = new int[]{a ,b ,c};
        Arrays.sort(array);
        if (array[2] < array[1] + array[0]) {
            return true;
        }
        return false;
    }
}
