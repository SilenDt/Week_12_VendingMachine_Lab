package PaymentTypePackage;

public enum CoinType {

    ONE_PENCE(0.01),
    TWO_PENCE(0.02),
    FIVE_PENCE(0.05),
    TEN_PENCE(0.10),
    TWENTY_PENCE(0.20),
    FIFTY_PENCE(0.50),
    ONE_POUND(1.00),
    TWO_POUND(2.00);

    private final double value;

    CoinType(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
