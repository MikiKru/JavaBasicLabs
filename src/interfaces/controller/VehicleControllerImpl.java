package interfaces.controller;

import interfaces.model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// implementacja logiki aplikacji
public class VehicleControllerImpl implements VehicleController {
    private List<Vehicle> vehicles = new ArrayList<>(
            Arrays.asList(
            new Vehicle("VW","Passat"),
            new Vehicle("VW","Golf"),
            new Vehicle("VW","Polo")
            )
    );
    @Override
    public void getVehicles() {
        vehicles.forEach(System.out::println);
    }
    @Override
    public Vehicle addVehicle(String brand, String model) {
        Vehicle vehicle = new Vehicle(brand, model);
        vehicles.add(vehicle);
        return vehicle;
    }
}
