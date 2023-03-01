import ProductPackage.Cola;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColaTest {

    //INSTANCE VARIABLES:
    private Cola cola;

    //SETUP:
    @Before
    public void before() {
        cola = new Cola("coke", 1.00, "A1");
    }

    //TEST:
    @Test
    public void hasName() {
        assertEquals("coke", cola.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(1.00, cola.getPrice(), 0.0);
    }

    @Test
    public void hasItemCode() {
        assertEquals("A1", cola.getItemCode());
    }


}
