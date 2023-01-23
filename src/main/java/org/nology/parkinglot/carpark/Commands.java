package org.nology.parkinglot.carpark;

import org.nology.parkinglot.vehicle.Car;
import org.nology.parkinglot.vehicle.Motorcycle;
import org.nology.parkinglot.vehicle.Van;
import org.nology.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {

    private String[] welcomeOpt = {"Check number of available space", "Park car", "Leave"};
    private String[] parkingOpt = {"Car", "Motorcycle", "Van"};
    private String[] availabilityOpt = {"Check the number of available parking spot", "Check the total number of parking spot", "Check if parking lot is full", "Check if parking lot is empty", "Check how many spots vans are taking up", "Exit"};
    private ParkingLot parkingLot;
    private boolean isCheckAvailability;
    private List<Vehicle> vehiclesCurrentlyParked = new ArrayList<>();

    public Commands (ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void greeting() {
        System.out.println("Welcome!\n");
        for (int i = 0; i < welcomeOpt.length; i++) {
            System.out.println(String.format("%d: %s", i+1, welcomeOpt[i]));
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
                System.out.println("Invalid input. Goodbye!");
        }
    }

    public void checkAvailability () {
        while (isCheckAvailability) {
            System.out.println("");
            for (int i = 0; i < availabilityOpt.length; i++) {
                System.out.println(String.format("%d) %s", i+1, availabilityOpt[i]));
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
                    if (parkingLot.isFull() == true) {
                        System.out.println("This parking lot is full.");
                    } else {
                        System.out.println("This parking lot is not full.");
                    }
                    break;
                case 4:
                    parkingLot.isEmpty();
                    if (parkingLot.isEmpty() == true) {
                        System.out.println("This parking lot is empty.");
                    } else {
                        System.out.println("This parking lot is not empty.");
                    }
                    break;
                case 5:
                    System.out.println("Vans are currently taking up " + parkingLot.getNumOfSpotVanOccupied() +" spots.");
                    break;
                case 6:
                    isCheckAvailability = false;
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Invalid input. E.g. Input 1 for number of available parking spot.");
            }
        }
    }

    public void parkCar () {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < parkingOpt.length; i++) {
            System.out.println(String.format("%d. %s", i+1, parkingOpt[i]));
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
                    size = "regular";
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

    public void leaveCarPark () {
        System.out.println("Goodbye!");
    }

}
