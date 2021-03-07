package emergon.model;

import java.text.DecimalFormat;
import java.util.EnumSet;
import java.util.Random;

public class TShirt {

    private String name;
    private double price;
    private Color color;
    private Size size;
    private Fabric fabric;
    private static String[] names;

    static {
        names = new String[]{"Aloha", "Baseball", "Camp",
            "Epaulette", "Lumberjack", "Granddad", "Golf",
            "Henley", "Polo", "Tuxedo", "Tunic", "Sweatshirt"};
    }

    public TShirt() {
        name = randomName();
        color = randomColor();
        size = randomSize();
        fabric = randomFabric();
        price = computePrice();

    }

    public static String[] getNames() {
        return names;
    }

    public TShirt(String name, double price, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        computePrice();

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    private String randomName() {
        Random random = new Random();
        int arrayLength = names.length;
        int randomNumber = random.nextInt(arrayLength);
        String randomName = names[randomNumber];
        return randomName;
    }

    private Size randomSize() {
        Random random = new Random();
        Size[] sizes = Size.values();
        return sizes[random.nextInt(sizes.length)];
    }

    private Color randomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }

    private Fabric randomFabric() {
        Random random = new Random();
        Fabric[] fabrics = Fabric.values();
        int index = random.nextInt(fabrics.length);
        Fabric randomFabric = fabrics[index];
        return randomFabric;
    }

    private double computePrice() {
        double priceSize = size.getPrice();
        double priceColor = color.getPrice();
        double priceFabric = fabric.getPrice();

        return price = priceSize + priceColor + priceFabric;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TShirt: ")
                .append("name= ").append(name).append(",")
                .append(String.format("price= %.2f", price)).append(",")
                .append("color= ").append(color).append(",")
                .append("size= ").append(size).append(",")
                .append("fabric= ").append(fabric);

        return builder.toString();

    }

}
