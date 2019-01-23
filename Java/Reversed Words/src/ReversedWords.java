
//Complete the solution so that it reverses all of the words within the string passed in.
//
//        Example:
//
//        ReverseWords.reverseWords("The greatest victory is that which requires no battle");
//// should return "battle no requires which that is victory greatest The"

public class ReverseWords{

    public static String reverseWords(String str){

        String[] tab = str.split("\u0020");
        String[] reverse = new String[tab.length];

        for (int i = 0; i < tab.length ; i++) {
            reverse[i] = tab[tab.length-i-1];
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < reverse.length ; i++) {
            if(i<reverse.length-1)
                stringBuilder.append(reverse[i]+" ");
            else
                stringBuilder.append(reverse[i]);
        }
        String name = stringBuilder.toString();
        return name;
    }
}

