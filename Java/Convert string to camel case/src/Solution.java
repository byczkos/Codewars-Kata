
//Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within
// the output should be capitalized only if the original word was capitalized.
//
//        Examples:
//
//// returns "theStealthWarrior"
//        toCamelCase("the-stealth-warrior")
//
//// returns "TheStealthWarrior"
//        toCamelCase("The_Stealth_Warrior")

import java.lang.StringBuilder;
class Solution{

    static String toCamelCase(String s){
        String[] stringTable = s.split("-|\\_");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringTable.length; i++) {
            if (i == 0) {
                stringBuilder.append(stringTable[i]);
            } else {
                stringTable[i] = Character.toUpperCase(stringTable[i].charAt(0)) + stringTable[i].substring(1);
                stringBuilder.append(stringTable[i]);
            }
        }
        return stringBuilder.toString();
    }
}
