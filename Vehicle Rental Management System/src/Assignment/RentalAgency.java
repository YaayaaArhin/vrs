package Assignment;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> vehicleFleet;

    public RentalAgency() {
        vehicleFleet = new ArrayList<>();

    }


    public void addVehicleToFleet(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle(String vehicleType) {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.isAvailableForRental() && vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleType)) {
                return vehicle;
            }
        }

        return null;
    }


}




