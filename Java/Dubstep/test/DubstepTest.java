
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DubstepTest {

    @Test
    public void testSongDecoder1() {
        assertEquals("WE ARE THE CHAMPIONS MY FRIEND", new Dubstep().SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

    @Test
    public void testSongDecoder2() {
        assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void testSongDecoder3() {
        assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }

}
