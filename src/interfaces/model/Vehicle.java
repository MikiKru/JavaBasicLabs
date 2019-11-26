package interfaces.model;

import java.util.ArrayList;

// wzorzec javabeans - klasa modelu - determinująca strukturę danych
// 1. pola prywatne
// 2. publiczne gettery i settery
// 3. konstruktory
// 4. toString
public class Vehicle {
    private String brand;
    private String model;

    private Vehicle() { }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getBrand() {

        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
