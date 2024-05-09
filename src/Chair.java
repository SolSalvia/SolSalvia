public class Chair extends Furniture{
    private Boolean wheels = false; //false si no tiene, true si tiene

    public Chair(Integer stock, String name, Float price, Boolean wheels) {
        super(stock, name, price);
        this.wheels = wheels;
    }

    public Boolean getWheels() {
        return wheels;
    }

    public void setWheels(Boolean wheels) {
        this.wheels = wheels;
    }
    public void updatePrice(double percentageIncrement){
        double increment = getPrice() * percentageIncrement;
        setPrice(getPrice() + (float) increment);
    }
    public float applyDiscount(float discountPercentage){
        float discountedPrice = getPrice() * (1 - discountPercentage / 100);
        return discountedPrice;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "Name: " + getName() + '\'' +
                "Stock: " + getStock() + '\'' +
                "Price: " + getPrice() + '\'' +
                "Wheels: " + wheels + '\'' +
                '}';
    }
}
