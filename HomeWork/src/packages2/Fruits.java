package packages2;

public class Fruits {

    private String name;
    private String colour;
    private int kilo;
    private int price;

    Fruits(String _name, String _colour, int _kilo, int _price) {
        name = _name;
        colour = _colour;
        kilo = _kilo;
        price = _price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}