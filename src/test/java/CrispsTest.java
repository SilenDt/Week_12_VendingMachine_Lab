import ProductPackage.Crisps;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrispsTest {

    private Crisps crisps;

    @Before
    public void before() {
        crisps = new Crisps("doritos", 0.50, "B2");
    }

    //TEST:
    @Test
    public void hasName() {
        assertEquals("doritos", crisps.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(0.50, crisps.getPrice(), 0.0);
    }

    @Test
    public void hasItemCode() {
        assertEquals("B2", crisps.getItemCode());
    }
}
