
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DigPowTest {

    @Test
    public void testDigPow1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }
    
    @Test
    public void testDigPow2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }
    
    @Test
    public void testDigPow3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }
    
}
