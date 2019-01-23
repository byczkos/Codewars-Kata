import java.util.List;
import static java.util.stream.Collectors.toList;

//HELP! Jason can't find his textbook! It is two days before the test date, and Jason's textbooks are all out of order!
// Help him sort a list (ArrayList in java) full of textbooks by subject, so he can study before the test.
//
//        The sorting should NOT be case sensitive

class sorter {
    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream().sorted((s1,s2) -> s1.compareToIgnoreCase(s2)).collect(toList());
    }
}