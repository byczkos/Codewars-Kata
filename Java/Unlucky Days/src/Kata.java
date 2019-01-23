
//    Friday 13th or Black Friday is considered as unlucky day. Calculate how many unlucky days are in the given year.
//
//    Find the number of Friday 13th in the given year.
//
//    Input: Year as an integer.
//
//    Output: Number of Black Fridays in the year as an integer.
//
//    Precondition: 1000 < |year| < 3000
//
//    Examples:
//
//    unluckyDays(2015) == 3
//    unluckyDays(1986) == 1
//    Note: for Ruby consider using the Gregorian Calendar instead of the default one 
//    (Italian), to have results coherent with other languages.

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Kata {

//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(unluckyDays(2015));
        System.out.println(unluckyDays(1986));
        System.out.println(unluckyDays(2003));
    }

    public static int unluckyDays(int year) {
        LocalDate firstDate = LocalDate.of(year, Month.JANUARY, 1);
        int counter = 0;
        while (firstDate.getYear() == year) {
            if (firstDate.getDayOfMonth() == 13 && firstDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
                counter++;
            }
            firstDate = firstDate.plusDays(1);
        }
        return counter;
    }
}
