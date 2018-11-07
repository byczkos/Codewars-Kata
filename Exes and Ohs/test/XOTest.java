
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class XOTest {

    @Test
    public void test_returnTrue() {
        assertEquals(XO.getXO("xxooztgd"), true);
    }

    @Test
    public void test_returnFalse() {
        assertEquals(XO.getXO("xxoztgd"), false);
    }
}
