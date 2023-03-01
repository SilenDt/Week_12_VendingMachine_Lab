package CustomerPackage;

import PaymentTypePackage.CoinType;
import ProductPackage.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

    //INSTANCE VARIABLES:
    ArrayList<CoinType> wallet;
    ArrayList<Product> productsBought;

    //CONSTRUCTOR:
    public Customer(ArrayList<CoinType> wallet, ArrayList<Product> productsBought) {
        this.wallet = wallet;
        this.productsBought = productsBought;
    }

    //GETTERS:
    public ArrayList<CoinType> getWallet() {
        return wallet;
    }

    public ArrayList<Product> getProductsBought() {
        return productsBought;
    }

    //get price of item you want to buy:
    //for each coin in your wallet
    //if the coin value <= amountToPay, remove the coin
    //amountToPay reduces

//        double amountToPay = snack.getPrice();
//        for (CoinType coin: wallet) {
//            if (coin.getValue() <= amountToPay) {
//                wallet.remove(coin);
//                amountToPay -= coin.getValue();
//            }
//        }
//    }

//    public double reduceWallet(Product snack) {

    public void reduceWallet(Product snack) {

        double amountToPay = snack.getPrice();
        Iterator<CoinType> iterator = wallet.iterator();
        while (iterator.hasNext()) {
            CoinType coin = iterator.next();

            if (coin.getValue() <= amountToPay) {
                iterator.remove();
                amountToPay -= coin.getValue();
                if(!iterator.hasNext()){
                    coin = iterator.next();
                    amountToPay -= coin.getValue();
                    iterator.remove();
                }


            }
        }

//        return amountToPay;
    }


        public double checkWalletSum() {
            double walletSum = 0;

            for (CoinType coin : wallet) {
                walletSum += coin.getValue();
            }
            return walletSum;
        }
    }
//    public void buy(Product snack) {
//
//    }

