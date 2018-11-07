
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DnaStrandTest {

    @Test
    public void test1() {
        assertEquals(DnaStrand.makeComplement("TTTT"), "AAAA");
    }

    @Test
    public void test2() {
        assertEquals(DnaStrand.makeComplement("TAACG"), "ATTGC");
    }

    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }

}
