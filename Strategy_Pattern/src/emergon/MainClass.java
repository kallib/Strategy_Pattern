package emergon;

import emergon.model.Cart;



public class MainClass {

    public static void main(String[] args) {

        Cart cart = Cart.getSingleCart();
        cart.fillCart(3);
        cart.printCartItems();
        
       
        cart.payTotal();
    }

}
