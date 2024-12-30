package Assignment;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Rental Management System! ");
        System.out.println("Please enter your email address: ");
        String email = sc.nextLine();
        System.out.println("Please enter your password: ");
        String password = sc.nextLine();
        car car = new car("2345", "Hyundai", 50, "Luxury");
        motorcycle motorcycle = new motorcycle("7690", "Harley", 30, true);
        truck truck = new truck("7120", "Ford", 70, 1500);


        Customer customer = new Customer("6781", "Yaayaa Arhin");


        RentalAgency rentalAgency = new RentalAgency();
        rentalAgency.addVehicleToFleet(car);
        rentalAgency.addVehicleToFleet(motorcycle);
        rentalAgency.addVehicleToFleet(truck);


        car.rent(customer, 5);
        motorcycle.rent(customer, 3);
        truck.rent(customer, 2);


        System.out.println("\nRental History for " + customer.getRentalHistory().size() + " rentals:");
        for (RentalTransaction transaction : customer.getRentalHistory()) {
            System.out.println(transaction.getVehicle().getModel() + " for " + transaction.getRentalDays() + " days, Cost: $" + transaction.getTotalCost());
        }

        car.returnVehicle();
        motorcycle.returnVehicle();
        truck.returnVehicle();
    }
}









