
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void testValidPhoneNumber1() {
        assertEquals(true, Kata.validPhoneNumber("(123) 456-7890"));
    }

    @Test
    public void testValidPhoneNumber2() {
        assertEquals(false, Kata.validPhoneNumber("(1111)555 2345"));
    }

    @Test
    public void testValidPhoneNumber3() {
        assertEquals(false, Kata.validPhoneNumber("(098) 123 4567"));
    }
}
