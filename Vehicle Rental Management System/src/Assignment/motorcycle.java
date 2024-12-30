package Assignment;

public class motorcycle extends Vehicle implements rentable{
    private boolean hasSidecar = false;

    public motorcycle(String vehicleId, String model, double baseRentalRate, boolean b) {
        super(vehicleId, model, baseRentalRate);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * (hasSidecar ? 1.5 : 1.0);
    }

    @Override
    public boolean isAvailableForRental(boolean available) {
        return false;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();  // Motorcycle availability check
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }


    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            double rentalCost = calculateRentalCost(days);
            System.out.println("Rental cost for " + getModel() + ": $" + rentalCost);
            setAvailable(false);
            customer.addRentalTransaction(new RentalTransaction(this, days));
        } else {
            System.out.println("Motorcycle is not available for rental.");
        }
    }

    @Override
    public  void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle has been returned.");
    }


}
