package interfaces.model;

public class Auto extends Vehicle {

    private double price;

    public Auto(String brand, String model, double price) {
        super(brand, model);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "price=" + price +
                "} " + super.toString();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
