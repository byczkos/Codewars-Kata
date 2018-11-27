
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ArgeTest {
    
    @Test
    public void test1() {
        assertEquals(15, Arge.nbYear(1500, 5, 100, 5000));
    }
    
    @Test
    public void test2() {
        assertEquals(10, Arge.nbYear(1500000, 2.5, 10000, 2000000));
    }
    
}
