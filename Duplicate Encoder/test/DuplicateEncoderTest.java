
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DuplicateEncoderTest {

    @Test
    public void test1() {
        assertEquals("(((", DuplicateEncoder.encode("din"));
    }

    @Test
    public void test2() {
        assertEquals("()()()", DuplicateEncoder.encode("recede"));
    }

    @Test
    public void test3() {
        assertEquals(")())())", DuplicateEncoder.encode("Success"));
    }

}
