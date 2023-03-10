package org.nology.parkinglot.vehicle;
import org.nology.parkinglot.carpark.ParkingLot;

public class Van extends Vehicle {

    private final int numOfSpot = 3;
    private static int numOfVan;
    private static int totalVanSpaceOccupied;

    public Van() {
        numOfVan++;
    }

    public void park(ParkingLot parkingLot) {
        if (Math.floor(parkingLot.getNumOfAvailableSpots()/3) > 0) {
            parkingLot.setNumOfAvailableSpots(parkingLot.getNumOfAvailableSpots()-3);
            parkingLot.setNumOfRegularSpot(parkingLot.getNumOfRegularSpot() -3);
            totalVanSpaceOccupied = (numOfVan*numOfSpot);
            parkingLot.setNumOfSpotVanOccupied(totalVanSpaceOccupied);
            parkingLot.setEmpty(false);
            System.out.println("Your van is parked.");
            System.out.println("There are currently " + parkingLot.getNumOfAvailableSpots() + " spots left.");
        } else {
            System.out.println("No more available parking spot for vans.");
        }
    }


}
