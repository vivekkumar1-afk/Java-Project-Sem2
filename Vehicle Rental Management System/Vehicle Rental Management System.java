import java.util.Scanner;

// Base Class
class Vehicle {
    String vehicleNumber;
    String brand;
    double rentPerDay;

    // Constructor
    Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    // Method to calculate rent
    double calculateRent(int days) {
        return rentPerDay * days;
    }

    // Display vehicle details
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent per Day: " + rentPerDay);
    }
}

// Car Class
class Car extends Vehicle {

    Car(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    // Method overriding
    @Override
    double calculateRent(int days) {
        return (rentPerDay * days) + 500; // extra charge
    }
}

// Bike Class
class Bike extends Vehicle {

    Bike(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    // Method overriding
    @Override
    double calculateRent(int days) {
        return rentPerDay * days; // normal rate
    }
}

// Main Class
public class VehicleRentalSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Vehicle Rental System =====");
        System.out.println("1. Rent Car");
        System.out.println("2. Rent Bike");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        Vehicle v; // Polymorphism

        switch (choice) {
            case 1:
                v = new Car("C101", "Honda", 1000);
                System.out.println("\n--- Car Details ---");
                break;

            case 2:
                v = new Bike("B101", "Yamaha", 300);
                System.out.println("\n--- Bike Details ---");
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        // Display details
        v.displayDetails();

        // Calculate rent (runtime polymorphism)
        double totalRent = v.calculateRent(days);

        System.out.println("Total Rent for " + days + " days: " + totalRent);

        sc.close();
    }
}