package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

        System.out.println("Enter the computer settings!");
        Computer firstComputer = new Computer(enterBool("Does the computer have a processor? +/-"),
                enterBool("Does the computer have RAM?"),
                enterBool("Does the computer have a hard drive?"),
                enterInt("Enter the resource of full work cycles."));

        firstComputer.output();
        firstComputer.checkComputerToWork();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public static boolean enterBool(String enterText) {
        Scanner newScan = new Scanner(System.in);
        System.out.println(enterText);
        return newScan.nextLine().equals("+");
    }
    public static int enterInt(String enterText) {
        Scanner newScan = new Scanner(System.in);
        System.out.println(enterText);
        try {
            return newScan.nextInt();
        }
        catch (Exception ex) {
            return 0;
        }
    }
}
