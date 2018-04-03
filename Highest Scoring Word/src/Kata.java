public class Kata {


    public static void main(String[] args) {
        System.out.println(high("what time are we climbing up to the volcano"));
    }

    public static String high(String s) {
        String[] tableOfStrings = s.split(" ");
        int[] sumTable = new int[tableOfStrings.length];
        for (int i = 0; i < tableOfStrings.length ; i++) {
            sumTable[i] = tableOfStrings[i].chars().sum() - 96 * tableOfStrings[i].length();
        }
        int max = sumTable[0];
        int maxIndex = 0;
        for (int i = 1; i < sumTable.length; i++) {
            if (sumTable[i] > max) {
                max = sumTable[i];
                maxIndex = i;
            }
        }
        return tableOfStrings[maxIndex];
    }
}
