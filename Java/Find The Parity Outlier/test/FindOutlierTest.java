
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FindOutlierTest {
    
    @Test
    public void testFind1() {
        assertEquals(FindOutlier.find(new int[]{3, 45, 22, 79, 357}), 22);
    }
    @Test
    public void testFind2() {
        assertEquals(FindOutlier.find(new int[]{206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}), 206847684);
    }
    @Test
    public void testFind3() {
        assertEquals(FindOutlier.find(new int[]{Integer.MAX_VALUE, 0, 1}), 0);
    }
}
