import ProductPackage.Sweets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SweetsTest {

    private Sweets sweets;

    @Before
    public void before() {
        sweets = new Sweets("skittles", 0.65, "C3");
    }

    //TEST:
    @Test
    public void hasName() {
        assertEquals("skittles", sweets.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(0.65, sweets.getPrice(), 0.0);
    }

    @Test
    public void hasItemCode() {
        assertEquals("C3", sweets.getItemCode());
    }
}
