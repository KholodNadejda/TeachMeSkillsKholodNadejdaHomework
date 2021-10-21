package lesson_4.transportClasses;

import lesson_4.abstractClasses.LandTransport;

import java.util.Scanner;

public class FreightLandTransport extends LandTransport {
    double carryingCapacity;

    public void enterParams() {
        Scanner newScan = new Scanner(System.in);

        System.out.println("CARGO GROUND TRANSPORT");
        super.enginePower = enterDouble("Enter horsepower:");
        super.maxSpeed = enterInt("Maximum speed:");
        super.weight = enterDouble("Weight: ");
        System.out.println("Vehicle brand: ");
        super.brand = newScan.nextLine();
        super.numberOfWheels = enterInt("Number of wheels:");
        super.fuelConsumption = enterDouble("Fuel consumption (l/100km):");
        this.carryingCapacity = enterDouble("Load capacity(t):");
    }

    public void outputCharacterFreighLandTrans() {
        System.out.printf("""
                        CARGO GROUND TRANSPORT
                        =====================================
                        Horsepower:                 || %.2f
                        =====================================
                        Maximum speed:              || %d
                        =====================================
                        Weight:                     || %.2f
                        =====================================
                        Vehicle brand:              || %s
                        =====================================
                        Number of wheels:           || %d
                        =====================================
                        Fuel consumption (l/100km): || %.2f
                        =====================================
                        Load capacity(t):           || %.2f
                        =====================================
                        Power in kilowatts(kV):     || %.2f
                        =====================================
                        
                        """,
                super.enginePower, super.maxSpeed, super.weight, super.brand,
                super.numberOfWheels, super.fuelConsumption,
                this.carryingCapacity,
                super.powerInKilowatts());
    }
    private void loadinIntoTruck(double cargo) {
        if (cargo > carryingCapacity) {
            System.out.println("You need a bigger truck.\n");
        }
        else {
            System.out.println("The truck is loaded.\n");
        }
    }
    public void enterWeightCargo() {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter the weight of the cargo:");
        try {
            loadinIntoTruck(newScan.nextDouble());
        }
        catch (Exception ex) {
            System.out.println("Error!\nYou entered the wrong format!\n");
        }
    }
}
