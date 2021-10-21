package lesson_4.abstractClasses;

import java.util.Scanner;

public class Transport {
    public double enginePower;
    public int maxSpeed;
    public double weight;
    public String brand;

    protected double powerInKilowatts(){
        return enginePower*0.74;
    }

    protected double enterDouble(String enterText) {
        Scanner newScan = new Scanner(System.in);
        System.out.println(enterText);
        try {
            return newScan.nextDouble();
        }
        catch (Exception ex) {
            System.out.println("Error!\nYou entered the wrong format!\n");
            return 0;
        }
    }

    protected int enterInt(String enterText) {
        Scanner newScan = new Scanner(System.in);
        System.out.println(enterText);
        try {
            return newScan.nextInt();
        }
        catch (Exception ex) {
            System.out.println("Error!\nYou entered the wrong format!\n");
            return 0;
        }
    }
    protected boolean enterBoolean(String enterText) {
        Scanner newScan = new Scanner(System.in);
        System.out.println(enterText);
        String value = newScan.nextLine();
        if (value.equals("+") || value.equals("-")) {
            return value.equals("+");
        }
        else {
            System.out.println("Error!\nYou entered the wrong format!\n");
            return false;
        }
    }
}
