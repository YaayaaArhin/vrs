package Assignment;

public class car extends Vehicle implements rentable{
    private String carType = new String();

    public car(String vehicleId, String model, double baseRentalRate, String luxury) {
        super(vehicleId, model, baseRentalRate);
        this.carType = carType;}

    @Override
    public double calculateRentalCost(int days) {
        // Special rule for car rental
        return getBaseRentalRate() * days * 1.2;
    }


    @Override
    public boolean isAvailableForRental(boolean available) {
        return isAvailable();
    }

    @Override
    public boolean isAvailableForRental() {
        return false;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            double rentalCost = calculateRentalCost(days);
            System.out.println("Rental cost for " + getModel() + ": $" + rentalCost);
            setAvailable(false);
            customer.addRentalTransaction(new RentalTransaction(this, days));
        } else {
            System.out.println("Car is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car has been returned.");
    }

}

