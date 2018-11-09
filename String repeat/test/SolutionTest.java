
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testRepeatHello() {
        assertEquals(Solution.repeatStr(3, "Hello"), "HelloHelloHello");
    }

    @Test
    public void testRepeatZero() {
        assertEquals(Solution.repeatStr(0, "World"), "");
    }

    @Test
    public void testRepeatEmptyString() {
        assertEquals(Solution.repeatStr(8, ""), "");
    }
}
