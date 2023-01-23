package org.nology.parkinglot.vehicle;

import org.nology.parkinglot.carpark.ParkingLot;

public class Motorcycle extends Vehicle {

    public Motorcycle() {

    }

    public void park(ParkingLot parkingLot) {
        parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots()-1);
        parkingLot.setEmpty(false);
        System.out.println("Your motorcycle is parked.");
        System.out.println("There are currently " + parkingLot.getNumOfAvailableSpots() + " spots left.");
    }

    public void leave(ParkingLot parkingLot) {
        if (parkingLot.isEmpty() == false) {
            parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots() + 1);
        }
    }
}
