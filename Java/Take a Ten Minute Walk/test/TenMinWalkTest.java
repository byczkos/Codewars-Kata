
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TenMinWalkTest {

    @Test
    public void testIsValid1() {
        assertEquals("Should return true", true, TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    @Test
    public void testIsValid2() {
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
    }

    @Test
    public void testIsValid3() {
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w'}));
    }

    @Test
    public void testIsValid4() {
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
