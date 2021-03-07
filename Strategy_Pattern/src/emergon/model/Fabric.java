
package emergon.model;


public enum Fabric {
    WOO(12.34), 
    COTTON(10.23),
    POLYESTER(11.56),
    RAYON(13.89),
    LINEN(11.65),
    CASHMERE(15.34),
    SILK(16.14);
    
    public final double price;
    
    private Fabric(double price){
    this.price=price;
    }

    

    public double getPrice() {
        return price;
    }
    
    

    
    
    
}
