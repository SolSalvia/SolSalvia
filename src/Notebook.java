public class Notebook extends ComputerProducts{
    private Integer GBTotal;

    public Notebook(Integer stock, String name, Float price, String manufacturerName, Integer GBTotal) {
        super(stock, name, price, manufacturerName);
        this.GBTotal = GBTotal;
    }

    public Integer getGBTotal() {
        return GBTotal;
    }

    public void setGBTotal(Integer GBTotal) {
        this.GBTotal = GBTotal;
    }
    public void updatePrice(double percentageIncrement) {
        double increment = getPrice() * percentageIncrement;
        setPrice(getPrice() + (float) increment);
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "Name: " + getName() + '\'' +
                "Stock: " + getStock() + '\'' +
                "Price: " + getPrice() + '\'' +
                "ManufacturerName: " + getManufacturerName() + '\'' +
                "GBTotal: " + GBTotal + '\'' +
                '}';
    }
}
