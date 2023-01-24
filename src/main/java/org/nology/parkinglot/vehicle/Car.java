package org.nology.parkinglot.vehicle;

import org.nology.parkinglot.carpark.ParkingLot;

public class Car extends Vehicle {

    private String size;
    private static int numOfCars;

    public Car (String size) {
        this.size = size;
        numOfCars++;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void park(ParkingLot parkingLot) {
            if (size == "small") {
                parkingLot.setNumOfCompactSpot(parkingLot.getNumOfCompactSpot()-1);
            } else if (size == "regular") {
                parkingLot.setNumOfRegularSpot(parkingLot.getNumOfRegularSpot()-1);
            }
            parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots()-1);
            parkingLot.setNumOfSpotCarOccupied(numOfCars);
            parkingLot.setEmpty(false);
            System.out.println("Your car is parked.");
            System.out.println("There are currently " + parkingLot.getNumOfAvailableSpots() + " spots left.");

    }

    @Override
    public void leave(ParkingLot parkingLot) {
        if (parkingLot.isEmpty() == false) {
            parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots()+1);
        }

    }
}
