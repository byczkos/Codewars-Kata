
public class Calculator {

    public static void main(String[] args) {
        evaluate("3 / 4 + 4 * 5");
//        System.out.print(evaluate("3 / 4"));
//        System.out.println(evaluate("3 / 4 * 4"));
//        System.out.println(evaluate("3 / 4 - 5"));
    }

    public static Double evaluate(String expression) {
        Double result = 0.0;
        expression = expression.replaceAll(" ", "");
        String resultOfMulAndDiv = new String();
        StringBuilder builder = new StringBuilder(expression);
//        System.out.println(builder.toString());
        int i = 0;
        while (expression.contains("*") || expression.contains("/")) {            
            if (!expression.isEmpty()) {
                if (expression.charAt(i) == '/') {
//                    System.out.println(expression.charAt(i - 1) + " char at i - 1");
//                    System.out.println(expression.charAt(i + 1) + " char at i + 1");
                    result = Double.parseDouble(Character.toString(expression.charAt(i - 1))) / Double.parseDouble(Character.toString(expression.charAt(i + 1)));
//                    resultOfMulAndDiv = resultOfMulAndDiv + result + " ";
                    expression = result + " " + expression.substring(0, i - 1).concat(expression.substring(i + 2));
                    System.out.println(expression);
                    System.out.println(resultOfMulAndDiv);
                    i++;
                }
            }
            if (!expression.isEmpty()) {
                if (expression.charAt(i) == '*') {
                    result = Double.parseDouble(Character.toString(expression.charAt(i - 1))) * Double.parseDouble(Character.toString(expression.charAt(i + 1)));
                    expression = result + " " + expression.substring(0, i - 1).concat(expression.substring(i + 2));
                    i++;
                }
            }
        }
        System.out.println(expression);
//            if (!expression.isEmpty()) {
//                if (expression.charAt(i) == '*') {
//                    result = Double.parseDouble(Character.toString(expression.charAt(i - 1))) * Double.parseDouble(Character.toString(expression.charAt(i + 1)));
//                }
//            }
//            if (!expression.isEmpty()) {
//                if (expression.charAt(i) == '-') {
//                    result = Double.parseDouble(Character.toString(expression.charAt(i - 1))) - Double.parseDouble(Character.toString(expression.charAt(i + 1)));
//                }
//            }
//            if (!expression.isEmpty()) {
//                if (expression.charAt(i) == '+') {
//                    result = Double.parseDouble(Character.toString(expression.charAt(i - 1))) + Double.parseDouble(Character.toString(expression.charAt(i + 1)));
//                }
//            }
        return result;
    }
}
