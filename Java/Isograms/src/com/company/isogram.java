package com.company;

//        An isogram is a word that has no repeating letters, consecutive or non-consecutive.
//        Implement a function that determines whether a string that contains only letters
//        is an isogram. Assume the empty string is an isogram. Ignore letter case.
//
//        isIsogram "Dermatoglyphics" == true
//        isIsogram "moose" == false
//        isIsogram "aba" == false


public class isogram {
    public static boolean isIsogram(String str) {
        String tempStr = str.toLowerCase();
        char[] tableOfString = tempStr.toCharArray();
        if (str.isEmpty()) {
            return true;
        }
        Long numberofChar = tempStr.chars().count();
        Long numberOfUniqueChar= tempStr.chars().distinct().count();
        if (numberofChar.equals(numberOfUniqueChar)) {
            return true;
        }
        return false;
    }
}