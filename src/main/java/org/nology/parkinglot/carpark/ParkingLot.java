package org.nology.parkinglot.carpark;

import org.nology.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {


    private int numOfRegularSpot = 80;
    private int numOfCompactSpot = 40;
    private int totalNumOfParkingSpace = numOfRegularSpot + numOfCompactSpot;
    private int numOfAvailableSpots = totalNumOfParkingSpace;
    private boolean isFull = false;
    private boolean isEmpty = true;
    private int numOfSpotVanOccupied = 0;
    private List<Vehicle> vehiclesCurrentlyParked = new ArrayList<>();


    public List<Vehicle> getVehiclesCurrentlyParked() {
        return vehiclesCurrentlyParked;
    }

    public void setVehiclesCurrentlyParked(List<Vehicle> vehiclesCurrentlyParked) {
        this.vehiclesCurrentlyParked = vehiclesCurrentlyParked;
    }



    public int getNumOfRegularSpot() {
        return numOfRegularSpot;
    }

    public void setNumOfRegularSpot(int numOfRegularSpot) {
        this.numOfRegularSpot = numOfRegularSpot;
    }

    public int getNumOfCompactSpot() {
        return numOfCompactSpot;
    }

    public void setNumOfCompactSpot(int numOfCompactSpot) {
        this.numOfCompactSpot = numOfCompactSpot;
    }

    public int getNumOfAvailableSpots() {
        return numOfAvailableSpots;
    }

    public void setNumOfAvailableSpots(int numOfAvailableSpots) {
        this.numOfAvailableSpots = numOfAvailableSpots;
    }

    public int getTotalNumOfParkingSpace() {
        return totalNumOfParkingSpace;
    }

    public void setTotalNumOfParkingSpace(int totalNumOfParkingSpace) {
        this.totalNumOfParkingSpace = totalNumOfParkingSpace;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getNumOfSpotVanOccupied() {
        return numOfSpotVanOccupied;
    }

    public void setNumOfSpotVanOccupied(int numOfVanSpot) {
        this.numOfSpotVanOccupied = numOfVanSpot;
    }
}
