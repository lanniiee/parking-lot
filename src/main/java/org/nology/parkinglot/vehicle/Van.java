package org.nology.parkinglot.vehicle;

import org.nology.parkinglot.carpark.ParkingLot;

public class Van extends Vehicle {

    private boolean isParked;
    private int numOfSpot;

    public Van() {

    }

    public void park(ParkingLot parkingLot) {
        parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots()-3);
        parkingLot.setEmpty(false);
        System.out.println("Your van is parked.");
        System.out.println("There are currently " + parkingLot.getNumOfAvailableSpots() + " spots left.");
    }

    public void leave(ParkingLot parkingLot) {
        if (parkingLot.isEmpty() == false) {
            parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots() + 3);
        }
    }

}
