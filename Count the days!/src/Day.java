//    Little Annie is very excited for upcoming events. She want's to know how many days
//    she have to wait for a specific event.
//
//    Your job is to help her out.
//
//    Task: Write a function which returns the number of days from today till the given date.
//    The function will take a Date object as parameter. You have to round the amount of days.
//
//    If the event is in the past, return "The day is in the past!" 
//    If the event is today, return "Today is the day!" 
//    Else, return "x days"
//
//    PS: This is my first kata. I hope you have fun^^ 
//
//    This kata is part of the Collection "Date fundamentals":
//
//    #1 Count the Days!
//    #2 Minutes to Midnight
//    #3 Can Santa save Christmas?
//    #4 Christmas Present Calculator

//    URL: https://www.codewars.com/kata/count-the-days/train/java

import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Day {

// === this solution works good ===     
    public String countDays(Date d) {
        if (d.equals(Date.from(Instant.now()))) {
            return "Today is the day!";
        } else if (d.before(Date.from(Instant.now()))) {
            return "The day is in the past!";
        }
        Long period = d.getTime() - Date.from(Instant.now()).getTime();
        return TimeUnit.DAYS.convert(period, TimeUnit.MILLISECONDS) + " days";
    }

}
