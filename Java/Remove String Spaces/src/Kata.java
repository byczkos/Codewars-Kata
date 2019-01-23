//Simple, remove the spaces from the string, then return the resultant string.


class Kata {

    static String noSpace(final String x) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] noSpaceTable = x.split(" ");
        for (int i = 0; i < noSpaceTable.length; i++) {
            stringBuilder.append(noSpaceTable[i]);
        }
        String result = stringBuilder.toString();
        return result;
    }
}