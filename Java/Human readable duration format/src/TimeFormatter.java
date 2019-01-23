//    Your task in order to complete this Kata is to write a function which formats a
//    duration, given as a number of seconds, in a human-friendly way.
//
//    The function must accept a non-negative integer. If it is zero, it just returns 
//    "now". Otherwise, the duration is expressed as a combination of years, days, hours,
//    minutes and seconds.
//
//    It is much easier to understand with an example:
//
//    TimeFormatter.formatDuration(62)   //returns "1 minute and 2 seconds"
//    TimeFormatter.formatDuration(3662) //returns "1 hour, 1 minute and 2 seconds"
//    For the purpose of this Kata, a year is 365 days and a day is 24 hours.
//
//    Note that spaces are important.
//
//    Detailed rules
//    The resulting expression is made of components like 4 seconds, 1 year, etc. 
//    In general, a positive integer and one of the valid units of time, separated by a space.
//    The unit of time is used in plural if the integer is greater than 1.
//
//    The components are separated by a comma and a space (", "). Except the last component,
//    which is separated by " and ", just like it would be written in English.
//
//    A more significant units of time will occur before than a least significant one. Therefore,
//    1 second and 1 year is not correct, but 1 year and 1 second is.
//
//    Different components have different unit of times. So there is not repeated units like in
//    5 seconds and 1 second.
//
//    A component will not appear at all if its value happens to be zero. Hence, 1 minute and 0 
//    seconds is not valid, but it should be just 1 minute.
//
//    A unit of time must be used "as much as possible". It means that the function should not 
//    return 61 seconds, but 1 minute and 1 second instead. Formally, the duration specified
//    by of a component must not be greater than any valid more significant unit of time.

//    URL: https://www.codewars.com/kata/human-readable-duration-format/train/java

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        int time = seconds;
        System.out.println(seconds);
        if (seconds == 0) {
            return "now";
        }
        if (time < 60) {
            if (time == 1) {
                return seconds + " second";
            } else {
                return seconds + " seconds";
            }
        }
        StringBuilder builder = new StringBuilder();
        if (time >= 31536000) {
            int years = Math.floorDiv(time, 31536000);
            time -= years * 31536000;
            if (years == 1) {
                builder.append(years + " year");
            } else {
                builder.append(years + " years");
            }
            builder.append(", ");
        }
        if (time >= 86400) {
            int days = Math.floorDiv(time, 86400);
            time -= days * 86400;
            if (days == 1) {
                builder.append(days + " day");
            } else {
                builder.append(days + " days");
            }
            builder.append(", ");
        }
        if (time >= 3600) {
            int hours = Math.floorDiv(time, 3600);
            time -= hours * 3600;
            if (hours == 1) {
                builder.append(hours + " hour");
            } else {
                builder.append(hours + " hours");
            }
            builder.append(", ");
        }
        if (time >= 60) {
            int minutes = Math.floorDiv(time, 60);
            time -= minutes * 60;
            if (minutes == 1) {
                builder.append(minutes + " minute");
            } else {
                builder.append(minutes + " minutes");
            }
            builder.append(", ");
        }
        int restOfSeconds = time;
        if (restOfSeconds != 0) {
            if (restOfSeconds == 1) {
                builder.append(restOfSeconds + " second");
            } else {
                builder.append(restOfSeconds + " seconds");
            }
            builder.append(", ");
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        if (builder.toString().contains(", ")) {
            builder.replace(builder.lastIndexOf(", "), builder.lastIndexOf(", ") + 2, " and ");
        }
        builder.deleteCharAt(builder.lastIndexOf(" "));
        return builder.toString();
    }
}
