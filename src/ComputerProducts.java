public class ComputerProducts extends Product {
    private String manufacturerName;

    public ComputerProducts(Integer stock, String name, Float price, String manufacturerName) {
        super(stock, name, price);
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

}

