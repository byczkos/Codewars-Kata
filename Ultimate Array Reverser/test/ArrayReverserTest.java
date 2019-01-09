
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayReverserTest {

    @Test
    public void testMain() {
        assertEquals(new String[]{"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"},
                ArrayReverser.reverse(new String[]{"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}));
    }

}
