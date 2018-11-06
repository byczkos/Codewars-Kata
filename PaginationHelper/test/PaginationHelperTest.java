
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class PaginationHelperTest {

    /**
     * Test of itemCount method, of class PaginationHelper.
     */
    @Test
    public void testItemCount() {
        Assert.assertEquals(7, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g'), 4).itemCount());
    }

    /**
     * Test of pageCount method, of class PaginationHelper.
     */
    @Test
    public void testPageCount() {
        Assert.assertEquals(2, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g'), 4).pageCount());
    }

    /**
     * Test of pageItemCount method, of class PaginationHelper.
     */
    @Test
    public void testPageItemCount() {
        Assert.assertEquals(3, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g'), 4).pageItemCount(1));
    }

    /**
     * Test of pageIndex method, of class PaginationHelper.
     */
    @Test
    public void testPageIndex() {
        Assert.assertEquals(1, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g'), 4).pageIndex(6));
        Assert.assertEquals(-1, new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g'), 4).pageIndex(30));
        Assert.assertEquals(0, new PaginationHelper(Arrays.
                asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 's', 'y', '3', 'q', 'b', 'r', 'p', 'h', 'c', 'x', 'w', 'o', 'm'), 10).pageIndex(3));
    }

}
