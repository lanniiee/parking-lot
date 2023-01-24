package org.nology.parkinglot.carpark;

import org.nology.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {


    private static int numOfRegularSpot = 40;
    private static int numOfCompactSpot = 20;
    public static int totalNumOfParkingSpace = numOfRegularSpot + numOfCompactSpot;
    private static int numOfAvailableSpots = totalNumOfParkingSpace;
    private static boolean isFull = false;
    private static boolean isEmpty = true;
    private static int numOfSpotVanOccupied = 0;
    private static int numOfSpotCarOccupied = 0;
    private static int numOfSpotMotorcycleOccupied = 0;

    public static boolean isIsFull() {
        return isFull;
    }

    public static void setIsFull(boolean isFull) {
        ParkingLot.isFull = isFull;
    }

    public static boolean isIsEmpty() {
        return isEmpty;
    }

    public static void setIsEmpty(boolean isEmpty) {
        ParkingLot.isEmpty = isEmpty;
    }

    public static int getNumOfSpotCarOccupied() {
        return numOfSpotCarOccupied;
    }

    public static void setNumOfSpotCarOccupied(int numOfSpotCarOccupied) {
        ParkingLot.numOfSpotCarOccupied = numOfSpotCarOccupied;
    }

    public static int getNumOfSpotMotorcycleOccupied() {
        return numOfSpotMotorcycleOccupied;
    }

    public static void setNumOfSpotMotorcycleOccupied(int numOfSpotMotorcycleOccupied) {
        ParkingLot.numOfSpotMotorcycleOccupied = numOfSpotMotorcycleOccupied;
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
