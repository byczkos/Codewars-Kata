
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimeFormatterTest {

    @Test
    public void testFormatDuration1() {
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
    }

    @Test
    public void testFormatDuration2() {
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }

    @Test
    public void testFormatDuration3() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
    }

    @Test
    public void testFormatDuration4() {
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
    }
}
