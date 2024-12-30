package Assignment;

public abstract class Vehicle {

    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
    }
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.isEmpty()) throw new IllegalArgumentException("Vehicle ID cannot be empty.");
        this.vehicleId = vehicleId;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) throw new IllegalArgumentException("Model cannot be empty.");
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate <= 0) throw new IllegalArgumentException("Base rental rate must be positive.");
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract double calculateRentalCost (int days);
    public abstract boolean isAvailableForRental (boolean available);

    public abstract boolean isAvailableForRental();

    public void rent(Customer customer, int i) {
    }
}


