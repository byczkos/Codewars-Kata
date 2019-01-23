
//    Write a function, which takes a non-negative integer (seconds)
//    as input and returns the time in a human-readable format (HH:MM:SS)
//
//    HH = hours, padded to 2 digits, range: 00 - 99
//    MM = minutes, padded to 2 digits, range: 00 - 59
//    SS = seconds, padded to 2 digits, range: 00 - 59
//    The maximum time never exceeds 359999 (99:59:59)
//
//    You can find some examples in the test fixtures.

public class HumanReadableTime {

//   === check the solution ===
    public static void main(String[] args) {
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
    }

    public static String makeReadable(int seconds) {
        StringBuilder builder = new StringBuilder();
        int hour = Math.floorDiv(seconds, 3600);
        if (hour < 10) {
            builder.append("0" + hour);
        } else {
            builder.append(hour);
        }
        builder.append(":");
        int minutes = Math.floorDiv((seconds % 3600), 60);
        if (minutes < 10) {
            builder.append("0" + minutes);
        } else {
            builder.append(minutes);
        }
        builder.append(":");
        int restOfSeconds = seconds - hour * 3600 - minutes * 60;
        if (seconds - hour * 3600 - minutes * 60 < 10) {
            builder.append("0" + restOfSeconds);
        } else {
            builder.append(restOfSeconds);
        }
        return builder.toString();
    }
}
