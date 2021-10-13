package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private boolean processor;
    private boolean ram;
    private boolean hardDrive;
    private int fullWorkCycles;

    public Computer(boolean processor, boolean ram, boolean hardDrive, int fullWorkCycles) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.fullWorkCycles = fullWorkCycles;
    }
    public void output() {
        System.out.printf("Computer's processor is\t\t\t|| %s\n", convertToOutputBool(this.processor));
        System.out.printf("Computer's RAM is\t\t\t\t|| %s\n", convertToOutputBool(this.ram));
        System.out.printf("Computer's Hard Drive is\t\t|| %s\n", convertToOutputBool(this.hardDrive));
        System.out.printf("Computer's full work cycles are\t|| %d\n", this.fullWorkCycles);
    }
    private String convertToOutputBool(boolean value) {
        if (value) {
            return "exist";
        }
        return "not exist";
    }
    private void computerWork() {
        Random random = new Random();
        Scanner newScan = new Scanner(System.in);
            for (int i = 0; i < fullWorkCycles; i++) {
                System.out.println("Enter:\n0 or 1 to turn on the computer;\nany other symbol to turn off the computer.");
                String enterOperation = newScan.next();
                if(!(enterOperation.equals("0") || enterOperation.equals("1"))) {
                    System.out.println("Power off.");
                    return;
                }
                else if(!(enterOperation.equals(String.valueOf(random.nextInt(2))))) {
                    break;
                }
            }
        System.out.println("Critical error!\nThe computer burned down!");
    }
    public void checkComputerToWork() {
        if (processor && ram && hardDrive) {
            computerWork();
        }
        else {
            System.out.println("There are no components in the computer!\nEnd of work!");
        }
    }
}
