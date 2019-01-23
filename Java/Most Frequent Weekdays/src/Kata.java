
//    What is your favourite day of the week? Check if it's the most frequent day of the week in the year.
//
//    You are given a year as integer (e. g. 2001). You should return the most frequent
//    day(s) of the week in that year. The result has to be a list of days sorted by the
//    order of days in week (e. g. ['Monday', 'Tuesday']). Week starts with Monday.
//
//    Input: Year as an int.
//
//    Output: The list of most frequent days sorted by the order of days in week (from Monday to Sunday).
//
//    Preconditions: Year is between 1 and 9999. Week starts with Monday. Calendar is Gregorian.
//
//    Example:
//
//    Kata.mostFrequentDays(2427) => {'Friday'}
//    Kata.mostFrequentDays(2185) => {'Saturday'}
//    Kata.mostFrequentDays(2860) => {'Thursday', 'Friday'}

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Kata {

    public static void main(String[] args) {
        System.out.println(mostFrequentDays(328));
    }

    public static String[] mostFrequentDays(int year) {
        LocalDate startDate = LocalDate.of(year, 1, 1);
        LocalDate endDate = LocalDate.of(year + 1, 1, 1);
        int mondayCounter = 0;
        int tuesdayCounter = 0;
        int wednesdayCounter = 0;
        int thursdayCounter = 0;
        int fridayCounter = 0;
        int saturdayCounter = 0;
        int sundayCounter = 0;
        Map<String, Integer> map = new HashMap<>();
        while (startDate.isBefore(endDate)) {
            if (startDate.getDayOfWeek() == DayOfWeek.MONDAY) {
                mondayCounter++;
            } else if (startDate.getDayOfWeek() == DayOfWeek.TUESDAY) {
                tuesdayCounter++;
            } else if (startDate.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                wednesdayCounter++;
            } else if (startDate.getDayOfWeek() == DayOfWeek.THURSDAY) {
                thursdayCounter++;
            } else if (startDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
                fridayCounter++;
            } else if (startDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                saturdayCounter++;
            } else if (startDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCounter++;
            }
            startDate = startDate.plusDays(1);
        }
        map.put("Monday", mondayCounter);
        map.put("Tuesday", tuesdayCounter);
        map.put("Wednesday", wednesdayCounter);
        map.put("Thursday", thursdayCounter);
        map.put("Friday", fridayCounter);
        map.put("Saturday", saturdayCounter);
        map.put("Sunday", sundayCounter);
        int maxDays = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
        return map.entrySet()
                .stream()
                .filter(v -> v.getValue() == maxDays)
                .map(k -> k.getKey())
                .sorted(Comparator.comparing(o -> DayOfWeek.valueOf(o.toUpperCase())))
                .toArray(String[]::new);
    }
}
