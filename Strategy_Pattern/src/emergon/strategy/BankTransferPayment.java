
package emergon.strategy;

import java.text.DecimalFormat;


public class BankTransferPayment implements PaymentStrategy {
    
    private final String bank;
    private final String accountNumber;

    public BankTransferPayment(String bank, String accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }
    
    

    @Override
    public void pay(double price) {
        DecimalFormat df = new DecimalFormat("0.00");  
        System.out.println("Paid $ "+df.format(price)+" with Bank Transfer: "+this);
    }

    @Override
    public String toString() {
        return "BankTransferPayment{" + "bank=" + bank + ", accountNumber=" + accountNumber + '}';
    }
    
}
