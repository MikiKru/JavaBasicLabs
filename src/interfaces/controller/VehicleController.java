package interfaces.controller;

import interfaces.model.Vehicle;

public interface VehicleController {
    // pola publiczne / stałe / statyczne
    // zawiera tylko metody publiczne i abstrakcyjne
    // nie można utworzyć instancji interfejsu
    void getVehicles();

    Vehicle addVehicle(String brand, String model);
}
