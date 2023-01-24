package org.nology.parkinglot.carpark;

import org.nology.parkinglot.vehicle.Car;
import org.nology.parkinglot.vehicle.Motorcycle;
import org.nology.parkinglot.vehicle.Van;
import org.nology.parkinglot.vehicle.Vehicle;


import java.util.Scanner;

public class Commands {

    private final String[] welcomeOpt = {"Check number of available space", "Park vehicle", "Leave"};
    private final String[] parkingOpt = {"Car", "Motorcycle", "Van"};
    private final String[] availabilityOpt = {"Check the number of available parking spot", "Check the total number of parking spot", "Check if parking lot is full", "Check if parking lot is empty", "Check how many compact spots are available","Check how many regular spots are available", "Check how many spots certain vehicles are taking up", "Back"};
    private final ParkingLot parkingLot;
    private boolean isCheckAvailability;
    private boolean running = true;

    public Commands (ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void greeting() {

        while (running) {
            System.out.println("\nWelcome!\n");
            for (int i = 0; i < welcomeOpt.length; i++) {
                System.out.printf("%d: %s%n", i+1, welcomeOpt[i]);
            }
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    isCheckAvailability = true;
                    checkAvailability();
                    break;
                case 2:
                    parkCar();
                    break;
                case 3:
                    leaveCarPark();
                    break;
                default:
                    running = false;
                    System.out.println("Invalid input. Goodbye!");
            }
        }

    }

    public void checkAvailability () {
        while (isCheckAvailability) {
            for (int i = 0; i < availabilityOpt.length; i++) {
                System.out.printf("%d) %s%n", i+1, availabilityOpt[i]);
            }
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("There is a total of " + parkingLot.getNumOfAvailableSpots() + " spot available.");
                    break;
                case 2:
                    System.out.println("The total number of parking spot is " + parkingLot.getTotalNumOfParkingSpace());
                    break;
                case 3:
                    if (parkingLot.isFull()) {
                        System.out.println("This parking lot is full.");
                    } else {
                        System.out.println("This parking lot is not full.");
                    }
                    break;
                case 4:
                    if (parkingLot.isEmpty()) {
                        System.out.println("This parking lot is empty.");
                    } else {
                        System.out.println("This parking lot is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("There are currently " + parkingLot.getNumOfCompactSpot() + " compact spots available.");
                    break;
                case 6:
                    System.out.println("There are currently " + parkingLot.getNumOfRegularSpot() + " regular spots available.");
                    break;
                case 7:
                    checkCertainVehicleAvailability();
                    break;
                case 8:
                    isCheckAvailability = false;
                    break;
                default:
                    System.out.println("Invalid input. E.g. Input 1 for number of available parking spot.");
            }
        }
    }

    public void parkCar () {
        if (!parkingLot.isFull()) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < parkingOpt.length; i++) {
                System.out.printf("%d. %s%n", i+1, parkingOpt[i]);
            }
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Is your car small or regular? Type '1' for Small or '2' for regular");
                    userInput = scanner.nextInt();
                    String size = "regular";
                    if (userInput == 1) {
                        size = "small";
                        Vehicle car = new Car(size);
                        car.park(parkingLot);
                    } else if (userInput == 2) {
                        Vehicle car = new Car(size);
                        car.park(parkingLot);
                    } else {
                        System.out.println("incorrect input");
                    }
                    break;
                case 2:
                    Vehicle motorCycle = new Motorcycle();
                    motorCycle.park(parkingLot);
                    break;
                case 3:
                    Vehicle van = new Van();
                    van.park(parkingLot);
            }
        }

    }

    public void leaveCarPark () {
        running = false;
        System.out.println("Goodbye!");
    }

    public void checkCertainVehicleAvailability () {
        System.out.println("\nWhich vehicle would you like to check?\n");
        for (int i = 0; i < parkingOpt.length; i++) {
            System.out.printf("%d. %s%n", i+1, parkingOpt[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Cars are currently taking up " + parkingLot.getNumOfSpotCarOccupied() + " spots in this parking lot.");
                break;
            case 2:
                System.out.println("Motorcycles are currently taking up " + parkingLot.getNumOfSpotMotorcycleOccupied() + " spots in this parking lot.");
                break;
            case 3:
                System.out.println("Vans are currently taking up " + parkingLot.getNumOfSpotVanOccupied() + " spots in this parking lot.");
                break;
            default:
                System.out.println("Invalid input");
        }

    }

}
