//    Check to see if a string has the same amount of 'x's and 'o's. The method must return
//    a boolean and be case insensitive. The string can contain any char.
//
//    Examples input/output:
//
//    XO("ooxx") => true
//    XO("xooxx") => false
//    XO("ooxXm") => true
//    XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//    XO("zzoo") => false

public class XO {

    public static boolean getXO(String str) {
        int counterO = 0;
        int counterX = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') {
                counterX++;
            }
            if (str.toLowerCase().charAt(i) == 'o') {
                counterO++;
            }
        }
        if (counterO == counterX) {
            return true;
        }
        return false;
    }
}
