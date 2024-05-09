public class Desk extends Furniture{
    private Float height;
    private Float width;

    public Desk(Integer stock, String name, Float price, Float height, Float width) {
        super(stock, name, price);
        this.height = height;
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }
    public void updatePrice(double percentageIncrement) {
        double increment = getPrice() * percentageIncrement;
        setPrice(getPrice() + (float) increment);
    }
    @Override
    public String toString() {
        return "Desk{" +
                "Name: " + getName() + '\'' +
                "Stock: " + getStock() + '\'' +
                "Price: " + getPrice() + '\'' +
                "Height: " + height + '\'' +
                "Width: " + width + '\'' +
                '}';
    }
}

