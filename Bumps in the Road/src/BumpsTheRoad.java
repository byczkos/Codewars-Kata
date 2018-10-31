
//    Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle about
//    15 more bumps before it dies totally.
//
//    Unfortunately for you, your drive is very bumpy! Given a string showing either flat road ("_") or
//    bumps ("n"), work out if you make it home safely. 15 bumps or under, return "Woohoo!", over 15 bumps
//    return "Car Dead".

//    URL:  https://www.codewars.com/kata/bumps-in-the-road/discuss

public class BumpsTheRoad {

//    === check the solution ===
    public static void main(String[] args) {
        System.out.println(bumps("n"));
        System.out.println(bumps("nnnnnnnnnnnnnnnnnnnnn"));
        System.out.println(bumps("______n___n_"));
        System.out.println(bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        System.out.println(bumps("nn__nn_n___n___nnn_"));
        System.out.println(bumps("_n___nn__n_n___"));
    }

    public static String bumps(final String road) {
        int counter = 0;
        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == 'n') {
                counter++;
            }
        }
        if (counter > 15) {
            return "Car Dead";
        }
        return "Woohoo!";
    }
}
