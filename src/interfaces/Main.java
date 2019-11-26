package interfaces;

import interfaces.controller.VehicleController;
import interfaces.controller.VehicleControllerImpl;
import interfaces.model.Auto;
import interfaces.model.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
        VehicleController vc = new VehicleControllerImpl();
        System.out.println("Dodano: " + vc.addVehicle("X","X"));
        vc.getVehicles();

        Auto a = new Auto("Test","Test", 10000);
        a.setBrand("BMW");
        System.out.println(a);

    }
}
