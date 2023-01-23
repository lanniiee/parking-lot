package org.nology.parkinglot.vehicle;

import org.nology.parkinglot.carpark.ParkingLot;

public abstract class Vehicle {

    private boolean isParked;
    private int numOfSpot;
    private int id;

    public Vehicle() {

    }

    public Vehicle(boolean isParked, int numOfSpot, int id) {
        this.isParked = isParked;
        this.numOfSpot = numOfSpot;
        this.id = id;
    }

    public abstract void park(ParkingLot parkingLot);

    public void leave(ParkingLot parkingLot) {

    }

}
