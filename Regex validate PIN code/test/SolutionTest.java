
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testValidatePin1() {
        assertEquals(true, Solution.validatePin("1234"));
    }

    @Test
    public void testValidatePin2() {
        assertEquals(false, Solution.validatePin("12345"));
    }

    @Test
    public void testValidatePin3() {
        assertEquals(true, Solution.validatePin("123456"));
    }

    @Test
    public void testValidatePin4() {
        assertEquals(false, Solution.validatePin("song"));
    }
}
