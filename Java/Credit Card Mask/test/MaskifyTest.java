
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaskifyTest {

    @Test
    public void test1() {
        assertEquals("############5616", Maskify.maskify("4556364607935616"));
    }

    @Test
    public void test2() {
        assertEquals("#######5616", Maskify.maskify("64607935616"));
    }

    @Test
    public void test3() {
        assertEquals("1", Maskify.maskify("1"));
    }
}
