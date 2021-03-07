package emergon.strategy;

import java.text.DecimalFormat;

public class CreditCardPayment implements PaymentStrategy {

    private final String cardType;
    private final String cardNumber;
    private final String cvv;
    private final int expirationYear;

    public CreditCardPayment(String cardType, String cardNumber, String cvv, int expirationYear) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationYear = expirationYear;
    }

    @Override
    public void pay(double price) {
        DecimalFormat df = new DecimalFormat("0.00"); 
        System.out.println("Paid $ "+df.format(price)+" with Credit Card: "+this);
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" + "cardType=" + cardType + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", expirationYear=" + expirationYear + '}';
    }

}
