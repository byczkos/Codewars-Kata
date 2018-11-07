
//    Finish this kata with the unit tests as your only help! 
//
//    Task:
//
//    Implement:
//    Calculator.getTotalArea()
//    Define the different shapes: Square, Rectangle, Circle and Triangle

//    URL: https://www.codewars.com/kata/tdd-area-calculations

public class Calculator {
    
//    If You want paste the code at "codewars.com" You have to copy all figure classes and paste in one file.  
//    In addition, the word "public" should be removed before all classes
    
    public double getTotalArea(Figure... figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].gretArea();
        }
        return roundDouble(sum);
    }
    
    public double roundDouble(double d) {
        d = d * 100;
        int i = (int) Math.round(d);
        return (double) i/100;
    }
}
