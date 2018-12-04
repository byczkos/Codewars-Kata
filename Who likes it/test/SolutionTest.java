
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSomeMethodWith1Strings() {
        assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
    }

    @Test
    public void testSomeMethodWith2Strings() {
        assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
    }

    @Test
    public void testSomeMethodWith3Strings() {
        assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
    }

    @Test
    public void testSomeMethodWith4Strings() {
        assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
