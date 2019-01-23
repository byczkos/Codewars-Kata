
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MovieTest {
    
    @Test
    public void testMovie1() {
        assertEquals(43, Movie.movie(500, 15, 0.9));
    }
    
    @Test
    public void testMovie2() {
        assertEquals(24, Movie.movie(100, 10, 0.95));
    }
}
