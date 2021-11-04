package lesson5.Task5_2;

import java.util.*;

public class Task5_2 {

    static Map <String, Integer> alphabet = new HashMap<>();
    static public String enteringString;
    static String[] words;

    public static void main(String[] args) {
        englishLetters();
        enterString();
        countLetters();
        outputLetters();
    }
    static public void countLetters() {
        for (String word : words) {
            if (alphabet.containsKey(word)) {
                alphabet.put(word, alphabet.get(word) + 1);
            }
        }
    }
    static  public void englishLetters() {
        alphabet.put("A" , 0); alphabet.put("a" , 0);
        alphabet.put("B" , 0); alphabet.put("b" , 0);
        alphabet.put("C" , 0); alphabet.put("c" , 0);
        alphabet.put("D" , 0); alphabet.put("d" , 0);
        alphabet.put("E" , 0); alphabet.put("e" , 0);
        alphabet.put("F" , 0); alphabet.put("f" , 0);
        alphabet.put("G" , 0); alphabet.put("g" , 0);
        alphabet.put("H" , 0); alphabet.put("h" , 0);
        alphabet.put("I" , 0); alphabet.put("i" , 0);
        alphabet.put("J" , 0); alphabet.put("j" , 0);
        alphabet.put("K" , 0); alphabet.put("k" , 0);
        alphabet.put("L" , 0); alphabet.put("l" , 0);
        alphabet.put("M" , 0); alphabet.put("m" , 0);
        alphabet.put("N" , 0); alphabet.put("n" , 0);
        alphabet.put("O" , 0); alphabet.put("o" , 0);
        alphabet.put("P" , 0); alphabet.put("p" , 0);
        alphabet.put("Q" , 0); alphabet.put("q" , 0);
        alphabet.put("R" , 0); alphabet.put("r" , 0);
        alphabet.put("S" , 0); alphabet.put("s" , 0);
        alphabet.put("T" , 0); alphabet.put("t" , 0);
        alphabet.put("U" , 0); alphabet.put("u" , 0);
        alphabet.put("V" , 0); alphabet.put("v" , 0);
        alphabet.put("W" , 0); alphabet.put("w" , 0);
        alphabet.put("X" , 0); alphabet.put("x" , 0);
        alphabet.put("Y" , 0); alphabet.put("y" , 0);
        alphabet.put("Z" , 0); alphabet.put("z" , 0);
    }
    public static void outputLetters() {
        for(Map.Entry<String, Integer> item : alphabet.entrySet()){

            System.out.printf("%s \u00BB %d \n", item.getKey(), item.getValue());
        }
    }
    public static void enterString() {
        System.out.println("Enter text: ");
        Scanner in = new Scanner(System.in);
        enteringString = in.nextLine();
        words = enteringString.split("");
    }
}
