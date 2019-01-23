
//    A stream of data is received and needs to be reversed. Each segment is 8 bits meaning
//    the order of these segments need to be reversed:
//
//    11111111 00000000 00001111 10101010
//
//    (byte1) (byte2) (byte3) (byte4)
//
//    10101010 00001111 00000000 11111111
//
//    (byte4) (byte3) (byte2) (byte1)
//
//    Total number of bits will always be a multiple of 8. The data is given in an array as such:
//    [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {

//     === check the solution ===
    public static void main(String[] args) {
        DataReverse(new int[]{0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1});
        DataReverse(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0});
    }
    
// now everything is OK, the problem was in return int array. We can't change input array.
    
    public static int[] DataReverse(int[] data) {
        StringBuilder builder = new StringBuilder();
        List<String> stringList = new ArrayList<>();
        int[] newData = new int[data.length];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            builder.append(data[i]);
            if ((i + 1) % 8 == 0) {
                stringList.add(builder.toString());
                builder.delete(0, builder.length());
            }
        }
//        System.out.println(stringList);
        Collections.reverse(stringList);
        StringBuilder builderToReverse = new StringBuilder();
        for (int i = 0; i < stringList.size(); i++) {
            builderToReverse.append(stringList.get(i));
        }
        String[] reversedArray = builderToReverse.toString().split("");
        for (int i = 0; i < reversedArray.length; i++) {
            newData[i] = Integer.parseInt(reversedArray[i]);
        }
// === if you wanto to see result, please uncomment this code ===

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println("");

        return newData;
    }
}
