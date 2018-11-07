
import org.junit.Assert;
import org.junit.Test;


public class KataTest {

    @Test
    public void testOpposite() {
        Assert.assertEquals(Kata.opposite(6), -6);
        Assert.assertEquals(Kata.opposite(-56), 56);
    }

}
