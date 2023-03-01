import CustomerPackage.Customer;
import PaymentTypePackage.CoinType;
import ProductPackage.Product;
import ProductPackage.Sweets;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private ArrayList<CoinType> wallet1;
    private ArrayList<Product> productsBought;
    private Sweets sweets;



    @Before
    public void before() {
        wallet1 = new ArrayList<>();
        productsBought = new ArrayList<>();
        customer = new Customer(wallet1, productsBought);
        wallet1.add(CoinType.TWENTY_PENCE);
        wallet1.add(CoinType.TWENTY_PENCE);
        wallet1.add(CoinType.TEN_PENCE);
        wallet1.add(CoinType.TEN_PENCE);
        wallet1.add(CoinType.FIVE_PENCE);
        sweets = new Sweets("skittles", 0.65, "C4");

    }

    @Test
    public void canGetWallet() {
        assertEquals(wallet1, customer.getWallet());
    }

    @Test
    public void canGetProductsBought() {
        productsBought.add(sweets);
        assertEquals(1, customer.getProductsBought().size());
    }

    @Test
    public void canCheckWalletSum() {
        assertEquals(0.65, customer.checkWalletSum(), 0.0);
    }

    @Test
    public void canReduceWallet() {
        customer.reduceWallet(sweets);
        assertEquals(0.00, customer.checkWalletSum(), 0.0);
    }


}
