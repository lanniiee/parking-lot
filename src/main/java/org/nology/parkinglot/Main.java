package org.nology.parkinglot;

import org.nology.parkinglot.carpark.Commands;
import org.nology.parkinglot.carpark.ParkingLot;


public class Main {


    public static void main(String[] args) {
        ParkingLot parkinglot = new ParkingLot();
        Commands commands = new Commands(parkinglot);
        commands.greeting();
    }

}