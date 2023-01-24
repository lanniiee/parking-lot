package org.nology.parkinglot.vehicle;

import org.nology.parkinglot.carpark.ParkingLot;

public class Motorcycle extends Vehicle {

    private static int numOfMotorcycle;

    public Motorcycle() {
        numOfMotorcycle++;
    }

    public void park(ParkingLot parkingLot) {
            parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots()-1);
            parkingLot.setNumOfSpotMotorcycleOccupied(numOfMotorcycle);
            if (parkingLot.getNumOfCompactSpot() > 0) {
                parkingLot.setNumOfCompactSpot(parkingLot.getNumOfCompactSpot()-1);
            } else if (parkingLot.getNumOfCompactSpot() == 0) {
                parkingLot.setNumOfRegularSpot(parkingLot.getNumOfRegularSpot()-1);
            }
            parkingLot.setEmpty(false);
            System.out.println("Your motorcycle is parked.");
            System.out.println("There are currently " + parkingLot.getNumOfAvailableSpots() + " spots left.");
    }

    public void leave(ParkingLot parkingLot) {
        if (!parkingLot.isEmpty()) {
            parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots() + 1);
        }
    }
}
