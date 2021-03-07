package emergon.model;

import emergon.strategy.BankTransferPayment;
import emergon.strategy.CashPayment;
import emergon.strategy.CreditCardPayment;
import emergon.strategy.PaymentStrategy;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static int numberOfCarts;
    private List<TShirt> tshirts;
    private static Cart cart;
    private PaymentStrategy paymentStrategy;

    private Cart() {
        System.out.println("Creating Cart");
        tshirts = new ArrayList();
        numberOfCarts++;
    }

    public static Cart getSingleCart() {
        if (cart == null) {
            cart = new Cart();
        }
        return cart;
    }

    public static void printNumberOfCarts() {

        System.out.println("Number Of Carts " + numberOfCarts);
    }

    public void addTShirt(TShirt tshirt) {
        tshirts.add(tshirt);
    }

    public double computeTotalPrice() {
        double sum = 0;
        for (TShirt t : tshirts) {
            sum += t.getPrice();
        }
        return sum;
    }

    public void removeTShirt(TShirt tshirt) {
        tshirts.remove(tshirt);
    }

    private List<TShirt> getTshirts() {
        return tshirts;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payTotal() {
        double total = computeTotalPrice();
        if (total < 50) {
            paymentStrategy = new CashPayment();
        } else if (total < 100) {
            paymentStrategy = new CreditCardPayment("MasterCard", "34324389", "345", 2023);
        } else {
            paymentStrategy = new BankTransferPayment("Alpha Bank", "37429887498");
        }
        paymentStrategy.pay(total);
    }

    public void fillCart(int numberOfTshirts) {
        for (int i = 0; i < numberOfTshirts; i++) {
            TShirt t = new TShirt();
            addTShirt(t);
        }
    }

    public void printCartItems() {
        for (TShirt t : tshirts) {
            System.out.println(t);
        }
    }
}
