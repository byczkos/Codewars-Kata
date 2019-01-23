
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TriangleTesterTest {
    
    @Test
    public void testIsTriangle_returnTrue() {
        assertEquals(TriangleTester.isTriangle(3, 4, 5), true);
    }
    
    @Test
    public void testIsTriangle_returnFalse() {
        assertEquals(TriangleTester.isTriangle(7, 3, 3), false);
    }
}
