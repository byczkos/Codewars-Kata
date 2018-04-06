
//Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.
//
//        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//        If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.
//
//        For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
//
//        your_order("is2 Thi1s T4est 3a")
//        [1] "Thi1s is2 3a T4est"

import java.util.ArrayList;
import java.util.List;

public class Order {

    public static String order(String words) {
        String[] tableOfString = words.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        List<String> listOfString = new ArrayList<>();
        if (words.isEmpty()) {
            return "";
        }
        for (int i = 0; i < tableOfString.length; i++) {
            listOfString.add(" ");
        }
        for (int i = 0; i < tableOfString.length ; i++) {
            for (char c : tableOfString[i].toCharArray()) {
                if (Character.isDigit(c)) {
                    listOfString.set(Character.getNumericValue(c) - 1, tableOfString[i]);
                }
            }
        }
        for (int i = 0; i < listOfString.size() ; i++) {
            stringBuilder.append(listOfString.get(i));
            if (i < listOfString.size() - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}