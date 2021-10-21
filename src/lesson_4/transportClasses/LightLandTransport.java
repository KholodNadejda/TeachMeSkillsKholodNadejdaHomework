package lesson_4.transportClasses;

import lesson_4.abstractClasses.LandTransport;

import java.util.Scanner;

public class LightLandTransport extends LandTransport {
    String bodyType;
    int numPassengers;

    public void enterParams() {
        Scanner newScan = new Scanner(System.in);

        System.out.println("PASSENGER GROUND TRANSPORT");
        super.enginePower = enterDouble("Enter horsepower:");
        super.maxSpeed = enterInt("Maximum speed:");
        super.weight = enterDouble("Weight: ");
        System.out.println("Vehicle brand: ");
        super.brand = newScan.nextLine();
        super.numberOfWheels = enterInt("Number of wheels:");
        super.fuelConsumption = enterDouble("Fuel consumption (l/100km):");
        System.out.println("Body type:");
        this.bodyType = newScan.nextLine();
        this.numPassengers = enterInt("Maximum number of passengers:");
    }

    public void outputCharacterLighLandTrans() {
        System.out.printf("""
                        PASSENGER GROUND TRANSPORT
                        =======================================
                        Horsepower:                   || %.2f
                        =======================================
                        Maximum speed:                || %d
                        =======================================
                        Weight:                       || %.2f
                        =======================================
                        Vehicle brand:                || %s
                        =======================================
                        Number of wheels:             || %d
                        =======================================
                        Fuel consumption (l/100km):   || %.2f
                        =======================================
                        Body type:                    || %s
                        =======================================
                        Maximum number of passengers: || %d
                        =======================================
                        Power in kilowatts(kV):       || %.2f
                        =======================================
                        
                        """,
                super.enginePower, super.maxSpeed, super.weight, super.brand,
                super.numberOfWheels, super.fuelConsumption,
                this.bodyType, this.numPassengers,
                super.powerInKilowatts());
    }

    private void maxDistanceInTime (double timeForCalc, double time) {
        double maxKm = super.maxSpeed * timeForCalc;
        System.out.printf("За время %.2f ч, автомобиль %s двигаясь с максимальной скоростью %d км/ч проедет %.1f км и израсходует %.1f литров топлива.\n",
                time, super.brand, super.maxSpeed, maxKm, fuelConsumptForACertainTime(super.fuelConsumption, maxKm));
    }
    private double fuelConsumptForACertainTime(double fuelConsumption, double maxKm) {
        return fuelConsumption * maxKm / 100;
    }

    public void enterTimeForMaxDistance() {
        Scanner newScan = new Scanner(System.in);
        double time;
        System.out.println("Enter the time that the car will drive:");
        try {
            time = newScan.nextDouble();
            maxDistanceInTime(workWithTime(time), time);
        }
        catch (Exception ex) {
            System.out.println("Error!\nYou entered the wrong format!\n");
        }
    }
    private double workWithTime(double time) {
        return (((int)time * 60.0 + (int)((time - (int)time) * 100.0))/60.0);
    }
}
