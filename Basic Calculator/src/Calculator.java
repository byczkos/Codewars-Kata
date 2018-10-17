
//    Write a function called calculate that takes 3 values. The first and third values are numbers. 
//    The second value is a character. If the character is "+" , "-", "*", or "/", the function will
//    return the result of the corresponding mathematical function on the two numbers. If the string
//    is not one of the specified characters, the function should return null (throw an ArgumentException in C#).
//
//    calculate(2,"+", 4); //Should return 6
//    calculate(6,"-", 1.5); //Should return 4.5
//    calculate(-4,"*", 8); //Should return -32
//    calculate(49,"/", -7); //Should return -7
//    calculate(8,"m", 2); //Should return null
//    calculate(4,"/",0) //should return null
//    Keep in mind, you cannot divide by zero. If an attempt to divide by zero is made, return null (throw an ArgumentException in C#).

public class Calculator {
    
//    check the solution
    public static void main(String[] args) {
        System.out.println("4 + 9 = " + calculate(4, "+", 9));
        System.out.println("4 - 9 = " + calculate(4, "-", 9));
        System.out.println("4 * 9 = " + calculate(4, "*", 9));
        System.out.println("2 / 8 = " + calculate(2, "/", 8));
    }

    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        if (operation.equals("/") && numberTwo == 0) {
            return null;
        }
        if (operation.equals("*") && numberOne == 0  && numberTwo < 0) {
            return 0.0;
        }
        if (operation.equals("*") && numberOne < 0  && numberTwo == 0) {
            return 0.0;
        }
        switch (operation) {
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return numberOne * numberTwo;
            case "/":
                return numberOne / numberTwo;
            default: return null;
        }
    }
}
