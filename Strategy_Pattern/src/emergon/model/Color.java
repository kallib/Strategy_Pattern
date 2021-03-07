
package emergon.model;

public enum Color {
    RED(5), 
    ORANGE(3),
    YELLOW(6),
    GREEN(2),
    BLUE(4),
    INDIGO(1), 
    VIOLET(7);
    
    public final int price;
    
    private Color(int price){
    this.price=price;
    }

    public int getPrice() {
        return price;
    }
    
   

    
    

}


