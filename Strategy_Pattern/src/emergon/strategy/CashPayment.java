
package emergon.strategy;

import java.text.DecimalFormat;


public class CashPayment implements PaymentStrategy {

    @Override
    public void pay(double price) {
        DecimalFormat df = new DecimalFormat("0.00");  
        System.out.println("Paid $ "+df.format(price)+" with cash");
        
    }
    
}
