
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DateDaysTest {
    
    @Test
    public void dateDaysTest1() {
        assertEquals("2024-07-03", DateDays.dateNbDays(4281, 5087, 2));
        assertEquals("2018-03-13", DateDays.dateNbDays(9999, 11427, 6));
    }
    
    @Test
    public void dateDaysTest2() {
        assertEquals("2021-09-19", DateDays.dateNbDays(4620, 5188, 2));
    }
}
