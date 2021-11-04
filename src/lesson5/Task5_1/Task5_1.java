package lesson5.Task5_1;

import java.util.Scanner;

public class Task5_1 {


    private static double[] massive;

    public static void main(String[] args) {
        makeMassiveUsingKeybord();
        printMassive("Your base massive is:");
        sortMassiveByBubbleWay();
        printSortedDescMassive();
    }
    public static void makeMassiveUsingKeybord() {
        System.out.print("Enter massive size: \u00BB ");
        Scanner newScan = new Scanner(System.in);
        try {
            createMassive(newScan.nextInt());
        }
        catch (Exception ex) {
            System.out.println("Error!\nYou entered the wrong format!\n");
            System.exit(0);
        }
    }
    private static void createMassive(int n) {
        massive = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i+1);
            massive[i] = enterDouble();
        }
    }
    private static double enterDouble() {
        Scanner newScan = new Scanner(System.in);
        try {
            return newScan.nextDouble();
        }
        catch (Exception ex) {
            System.out.println("Error format! Entered 0!");
            return 0;
        }
    }
    public static void printMassive(String condition) {
        System.out.println(condition);
        for (double i : massive) {
            System.out.print(i + " ");
        }
    }
    public static void sortMassiveByBubbleWay() {
        double dummy;
        for (int start = 0; start < massive.length - 1; start++) {
            for (int index = 0; index < massive.length - 1 - start; index++) {
                if (massive[index] < massive[index + 1]){
                    dummy = massive[index];
                    massive[index] = massive[index + 1];
                    massive[index + 1] = dummy;
                }
            }
        }
    }
    public static void printSortedDescMassive() {
        System.out.println("\nSorted massive DESC: ");
        for (double i : massive) {
            System.out.print(i + " ");
        }
    }
}
