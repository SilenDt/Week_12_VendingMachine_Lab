package ProductPackage;

import PaymentTypePackage.CoinType;

public abstract class Product implements Buyable {

    //INSTANCE VARIABLES:
    private String name;
    private double price;
    private String itemCode;

    //CONSTRUCTOR:
    public Product(String name, double price, String itemCode) {
        this.name = name;
        this.price = price;
        this.itemCode = itemCode;
    }

    //GETTERS:
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getItemCode() {
        return itemCode;
    }


}
