
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PositiveTest {

    @Test
    public void testWithoutNegative() {
        assertEquals(13, Positive.sum(new int[]{2,4,5,1,1}));
    }
    
    @Test
    public void testWithNegative() {
        assertEquals(6, Positive.sum(new int[]{-2,4,-5,1,1}));
    }
}
