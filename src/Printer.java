public class Printer extends ComputerProducts {
    private Integer impressionsMin;

    public Printer(Integer stock, String name, Float price, String manufacturerName, Integer impressionsMin) {
        super(stock, name, price, manufacturerName);
        this.impressionsMin = impressionsMin;
    }

    public Integer getImpressionsMin() {
        return impressionsMin;
    }

    public void setImpressionsMin(Integer impressionsMin) {
        this.impressionsMin = impressionsMin;
    }

    public void updatePrice(double percentageIncrement) {
        double increment = getPrice() * percentageIncrement;
        setPrice(getPrice() + (float) increment);
    }
    public float applyDiscount(float discountPercentage){
        float discountedPrice = getPrice() * (1 - discountPercentage / 100);
        return discountedPrice;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "Name: " + getName() + '\'' +
                "Stock: " + getStock() + '\'' +
                "Price: " + getPrice() + '\'' +
                "ManufacturerName: " + getManufacturerName() + '\'' +
                "impressionsMin: " + impressionsMin + '\'' +
                '}';
    }
}

