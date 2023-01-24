package org.nology.parkinglot.vehicle;

import org.nology.parkinglot.carpark.ParkingLot;

public class Car extends Vehicle {

    private final String size;
    private static int numOfCars;

    public Car (String size) {
        this.size = size;
        numOfCars++;
    }

    @Override
    public void park(ParkingLot parkingLot) {
            if (size.equals("small")) {
                parkingLot.setNumOfCompactSpot(parkingLot.getNumOfCompactSpot()-1);
            } else if (size.equals("regular")) {
                parkingLot.setNumOfRegularSpot(parkingLot.getNumOfRegularSpot()-1);
            }
            parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots()-1);
            parkingLot.setNumOfSpotCarOccupied(numOfCars);
            parkingLot.setEmpty(false);
            System.out.println("Your car is parked.");
            System.out.println("There are currently " + parkingLot.getNumOfAvailableSpots() + " spots left.");

    }

}
