package Assignment;

public  class truck extends Vehicle implements  rentable {
    private int loadCapacity ;

    public truck(String vehicleId, String model, double baseRentalRate, int i) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 1.0;
    }

    @Override
    public boolean isAvailableForRental(boolean available) {
        return false;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            double rentalCost = calculateRentalCost(days);
            System.out.println("Rental cost for " + getModel() + ": $" + rentalCost);
            setAvailable(false);
            customer.addRentalTransaction(new RentalTransaction(this, days));
        } else {
            System.out.println("Truck is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Truck has been returned.");
    }
}


