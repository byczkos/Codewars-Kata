
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MorseCodeDecoderTest {
    
    @Test
    public void testDecode() {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }
    
}
