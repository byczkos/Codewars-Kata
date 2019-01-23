
import org.junit.Assert;
import org.junit.Test;


public class EvenOrOddTest {
    
    @Test
    public void testEven_or_odd() {
        Assert.assertEquals(EvenOrOdd.even_or_odd(7), "Odd");
        Assert.assertEquals(EvenOrOdd.even_or_odd(8), "Even");
    }
    
}
