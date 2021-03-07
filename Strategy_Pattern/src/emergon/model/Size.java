
package emergon.model;


public enum Size {
    XS(5), 
    S(6),
    M(7),
    L(8),
    XL(9),
    XXL(10),
    XXXL(11);
    
    public final int price;
    
    private Size(int price){
    this.price=price;
    }

    
    
   

    public int getPrice() {
        return price;
    }
    
    

    
    
    
}
