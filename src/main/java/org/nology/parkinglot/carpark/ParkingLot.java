package org.nology.parkinglot.carpark;
public class ParkingLot {


    private int numOfRegularSpot = 40;
    private int numOfCompactSpot = 20;
    public int totalNumOfParkingSpace = numOfRegularSpot + numOfCompactSpot;
    private int numOfAvailableSpots = totalNumOfParkingSpace;
    private final boolean isFull = false;
    private boolean isEmpty = true;
    private int numOfSpotVanOccupied = 0;
    private int numOfSpotCarOccupied = 0;
    private int numOfSpotMotorcycleOccupied = 0;


    public int getNumOfSpotCarOccupied() {
        return numOfSpotCarOccupied;
    }

    public void setNumOfSpotCarOccupied(int numOfSpotCarOccupied) {
        this.numOfSpotCarOccupied = numOfSpotCarOccupied;
    }

    public int getNumOfSpotMotorcycleOccupied() {
        return numOfSpotMotorcycleOccupied;
    }

    public void setNumOfSpotMotorcycleOccupied(int numOfSpotMotorcycleOccupied) {
        this.numOfSpotMotorcycleOccupied = numOfSpotMotorcycleOccupied;
    }

    public ParkingLot () {

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


    public boolean isFull() {
        return isFull;
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
