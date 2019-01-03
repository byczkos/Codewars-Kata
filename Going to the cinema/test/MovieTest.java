
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MovieTest {
    
    @Test
    public void testMovie1() {
        assertEquals(Movie.movie(500, 15, 0.9), 43);
    }
    
    @Test
    public void testMovie2() {
        assertEquals(Movie.movie(100, 10, 0.95), 24);
    }
}
