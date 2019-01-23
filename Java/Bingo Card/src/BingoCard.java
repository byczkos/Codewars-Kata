import java.util.*;

public class BingoCard {

    public static String[] getCard() {

        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < 25; i++) {
            if(i < 5) {
                while(set.size() < 5) {
                    set.add("B" + String.valueOf(new Random().nextInt(15) + 1));
                }
            }
            if(i >=5 && i < 10) {
                while(set.size() < 10) {
                    set.add("I" + String.valueOf(new Random().nextInt(15) + 16));
                }
            }
            if(i >=10 && i < 14) {
                while(set.size() < 14) {
                    set.add("N" + String.valueOf(new Random().nextInt(15) + 31));
                }
            }
            if(i >=14 && i < 19) {
                while(set.size() < 19) {
                    set.add("G" + String.valueOf(new Random().nextInt(15) + 46));
                }
            }
            if(i >=19 && i < 24) {
                while(set.size() < 24) {
                    set.add("O" + String.valueOf(new Random().nextInt(15) + 61));
                }
            }
        }
        String[] bingoTable = set.toArray(new String[set.size()]);
        return bingoTable;
    }
}