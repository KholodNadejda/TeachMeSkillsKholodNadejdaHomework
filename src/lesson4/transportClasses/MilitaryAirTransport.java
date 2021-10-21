package lesson4.transportClasses;

import lesson4.abstractClasses.AirTransport;

import java.util.Scanner;

public class MilitaryAirTransport extends AirTransport {
    boolean bailoutSystem;
    int numMissiles;

    public void enterParams() {
        Scanner newScan = new Scanner(System.in);

        System.out.println("MILITARY AIR TRANSPORT");
        super.enginePower = enterDouble("Enter horsepower:");
        super.maxSpeed = enterInt("Maximum speed:");
        super.weight = enterDouble("Weight: ");
        System.out.println("Vehicle brand: ");
        super.brand = newScan.nextLine();
        super.wingspan = enterDouble("Wingspan:");
        super.minRunwayLength = enterDouble("Minimum runway length for takeoff:");
        this.bailoutSystem = enterBoolean("Availability of an ejection system +/-: ");
        this.numMissiles = enterInt("Number of missiles on board:");
    }

    public void outputCharactMilitAirTrans() {
        System.out.printf("""
                        MILITARY AIR TRANSPORT
                        ==============================================
                        Horsepower:                          || %.2f
                        ==============================================
                        Maximum speed:                       || %d
                        ==============================================
                        Weight:                              || %.2f
                        ==============================================
                        Vehicle brand:                       || %s
                        ==============================================
                        Wingspan:                            || %.2f
                        ==============================================
                        Minimum runway length for takeoff:   || %.2f
                        ==============================================
                        Availability of an ejection system:  || %b
                        ==============================================
                        Number of missiles on board:         || %d
                        ==============================================
                        Power in kilowatts(kV):              || %.2f
                        ==============================================
                        
                        """,
                super.enginePower, super.maxSpeed, super.weight, super.brand,
                super.wingspan, super.minRunwayLength,
                this.bailoutSystem, this.numMissiles,
                super.powerInKilowatts());
    }
    public void gunshot() {
        if (numMissiles > 0) {
            numMissiles--;
            System.out.printf("Missile fired.\nNumber of missiles: %d.\n\n", numMissiles);
        }
        else {
            System.out.println("There are no ammunition.\n");
        }
    }
    public void ejection() {
        System.out.println(bailoutSystem?"The ejection was successful!\n":"You don't have such a system!\n");
    }
}
