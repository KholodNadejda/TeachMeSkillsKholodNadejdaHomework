package lesson6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6 {

    static String equation;
    static String[] elementsEquation;
    static Map<String, Integer> numbers = new HashMap<>();
    static {
        numbers.put("O", 0);
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
    }
    static int A = 0;
    static int result;
    static int convertResult = 0;
    static String rimResult = "";
    static boolean arab = false;
    static boolean rim = false;
    static String [] masNum;

    public static void main(String[] args) {
        enterEquation();
        checkLength();
        convertResult = result;
        parseResult();
    }
    public static void enterEquation() {
        System.out.println("Enter the equation using spaces.");
        Scanner in = new Scanner(System.in);
        equation = in.nextLine();
        makeElementsFromEquation();
    }
    public static void makeElementsFromEquation() {
        elementsEquation = equation.split(" ");
    }
    public static void checkLength() {
        if(elementsEquation.length < 3)
        {
            System.out.println("Incorrect format!");
        } else {
            firstOperation();
        }
    }

    public static void firstOperation() {
        for (int i = 0; i < elementsEquation.length-2; ) {
            if (elementsEquation[i+1].equals("*")) {
                checkSymbol(i);
                result = A;
                checkSymbol(i+2);
                result = result * A;
                newString(i);
            }
            if (elementsEquation[i+1].equals("/")) {
                checkSymbol(i);
                result = A;
                checkSymbol(i+2);
                if (A == 0) {
                    System.out.println("/ by zero");
                    System.exit(0);
                } else {
                    result = result / A;
                    newString(i);
                }
            }
            i = i+2;
        }
        calculation();
    }
    public static void newString(int i) {
        elementsEquation[i] = "0";
        elementsEquation[i+1] = "+";
        elementsEquation[i+2] = Integer.toString(result);
    }
    public static void calculation() {
        checkSymbol(0);
        result = A;
        for (int i = 1; i < elementsEquation.length; )
        {
            switch (elementsEquation[i]) {
                case "+" -> {
                    checkSymbol(i + 1);
                    result = result + A;
                }
                case "-" -> {
                    checkSymbol(i + 1);
                    result = result - A;
                }
                default -> System.out.println("Incorrect format of sign!");
            }
            i = i + 2;
        }
    }
    public static void checkSymbol(int i) {
        try {
            A = Integer.parseInt(elementsEquation[i]);
            arab = true;
        } catch (Exception ex) {
            try {
                parseInArab(i);
                rim = true;
            } catch (Exception ex2) {
                System.out.println("Incorrect format of number");
            }
        }
    }
    public static void parseInArab(int i) {
        A = 0;
        masNum = elementsEquation[i].split("");
        for (int j = 0; j < masNum.length; j++){
            try {
                if(masNum[j].equals("I") && masNum[j+1].equals("V")) {
                    A = A + 4;
                    j++;
                } else if (masNum[j].equals("I") && masNum[j+1].equals("X")) {
                    A = A + 9;
                    j++;
                }
                else {
                    A = A + numbers.get(masNum[j]);
                }
            }
            catch (Exception ex) {
                A = A + numbers.get(masNum[j]);
            }
        }
    }
    public static void parseResult() {
        if (convertResult >= 1000) {
            rimResult = rimResult + "M";
            convertResult = convertResult - 1000;
            parseResult();
        } else if (convertResult >= 500) {
            rimResult = rimResult + "D";
            convertResult = convertResult - 500;
            parseResult();
        } else if (convertResult >= 100) {
            rimResult = rimResult +"C";
            convertResult = convertResult - 100;
            parseResult();
        } else if (convertResult >= 50) {
            rimResult = rimResult + "L";
            convertResult = convertResult - 50;
            parseResult();
        } else if (convertResult >= 10) {
            rimResult = rimResult + "X";
            convertResult = convertResult - 10;
            parseResult();
        } else if (convertResult == 9) {
            rimResult = rimResult + "IX";
            outPut();
        } else if (convertResult >= 5) {
            rimResult = rimResult + "V";
            convertResult = convertResult - 5;
            parseResult();
        } else if (convertResult == 4) {
            rimResult = rimResult + "IV";
            outPut();
        } else if (convertResult >= 1) {
            rimResult = rimResult + "I";
            convertResult = convertResult - 1;
            parseResult();
        } else if (convertResult == 0) {
            outPut();
        }
    }
    public static void outPut() {
        if(arab) {
            System.out.println(result);
        }
        if (rim) {
            System.out.println(rimResult);
        }
    }
}
