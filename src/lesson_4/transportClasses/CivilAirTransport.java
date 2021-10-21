package lesson_4.transportClasses;

import lesson_4.abstractClasses.AirTransport;
import java.util.Scanner;

public class CivilAirTransport extends AirTransport {

    int maxNumOfPassengers;
    boolean businessClass;

    public void enterParams() {
        Scanner newScan = new Scanner(System.in);

        System.out.println("PASSENGER AIR TRANSPORT");
        super.enginePower = enterDouble("Enter horsepower:");
        super.maxSpeed = enterInt("Maximum speed:");
        super.weight = enterDouble("Weight: ");
        System.out.println("Vehicle brand: ");
        super.brand = newScan.nextLine();
        super.wingspan = enterDouble("Wingspan:");
        super.minRunwayLength = enterDouble("Minimum runway length for takeoff:");
        this.maxNumOfPassengers = enterInt("Maximum number of passengers: ");
        this.businessClass = enterBoolean("Availability of business class +/-:");
    }

    public void outputCharacterCivilAirTrans() {
        System.out.printf("""
                        PASSENGER AIR TRANSPORT
                        ============================================
                        Horsepower:                        || %.2f
                        ============================================
                        Maximum speed:                     || %d
                        ============================================
                        Weight:                            || %.2f
                        ============================================
                        Vehicle brand:                     || %s
                        ============================================
                        Wingspan:                          || %.2f
                        ============================================
                        Minimum runway length for takeoff: || %.2f
                        ============================================
                        Maximum number of passengers:      || %d
                        ============================================
                        Availability of business class:    || %b
                        ============================================
                        Power in kilowatts(kV):            || %.2f
                        ============================================
                        
                        """,
                super.enginePower, super.maxSpeed, super.weight, super.brand,
                super.wingspan, super.minRunwayLength,
                this.maxNumOfPassengers, this.businessClass,
                super.powerInKilowatts());
    }
    private void loadIntoAitTrans(int passengers) {
        if (passengers > maxNumOfPassengers) {
            System.out.println("You need one more transport.\n");
        }
        else {
            System.out.println("The air transport is loaded.\n");
        }
    }
    public void enterNumPassenger() {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter number of passengers:");
        try {
            loadIntoAitTrans(newScan.nextInt());
        }
        catch (Exception ex) {
            System.out.println("Error!\nYou entered the wrong format!\n");
        }
    }

}
