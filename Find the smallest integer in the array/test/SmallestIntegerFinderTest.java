
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmallestIntegerFinderTest {
    
    @Test
    public void testPositiveNumber() {
        assertEquals(SmallestIntegerFinder.findSmallestInt(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 1);
    }
    
    @Test
    public void testNegativeNumber() {
        assertEquals(SmallestIntegerFinder.findSmallestInt(new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10}), -10);
    }
    
    @Test
    public void testPositiveAndNegativeNumber() {
        assertEquals(SmallestIntegerFinder.findSmallestInt(new int[]{1, 2, -3, 4, 5, -6, 7, -8, 9, 10, -110}), -110);
    }
    
}
