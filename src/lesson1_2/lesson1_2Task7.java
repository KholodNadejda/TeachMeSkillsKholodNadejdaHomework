package lesson1_2;

import java.util.Scanner;

public class lesson1_2Task7 {
    public static void main(String[] args) {
        String enteredNumberInString = enterNumber();
        if (enteredNumberInString == null) {
            return;
        }
        int numProgFull = Integer.parseInt(enteredNumberInString);
        if (numProgFull > 10) { //для чисел 11, 12, 13, 14 действует исключение в правилах русского языка
            enteredNumberInString = enteredNumberInString.substring(enteredNumberInString.length() - 2);
        }
        if (    Integer.parseInt(enteredNumberInString) == 11 ||
                Integer.parseInt(enteredNumberInString) == 12 ||
                Integer.parseInt(enteredNumberInString) == 13 ||
                Integer.parseInt(enteredNumberInString) == 14 ) {
            System.out.println(numProgFull + " программистов.");
            return;
        }
        enteredNumberInString = enteredNumberInString.substring(enteredNumberInString.length() - 1);
        if (Integer.parseInt(enteredNumberInString) == 1) {
            System.out.println(numProgFull + " программист.");
        } else if ( Integer.parseInt(enteredNumberInString) == 2 ||
                Integer.parseInt(enteredNumberInString) == 3 ||
                Integer.parseInt(enteredNumberInString) == 4) {
            System.out.println(numProgFull + " программиста.");
        } else {
            System.out.println(numProgFull + " программистов.");
        }
    }
    static String enterNumber() {
        for (int i = 1; i < 4; i++) { //более удобные параметры цикла, чтобы в код читался понятнее
            System.out.println("Введите количество программистов:");
            try {
                Scanner newScan = new Scanner(System.in); //если делать статик в классе вне методов то он не вызываектся каждый раз заново и не дает вводить новые строки
                return String.valueOf(newScan.nextInt()); //ретурн необходим для выхода из метода до истечения всех попыток
            }
            catch (Exception ex) {
                System.out.println("Вы ввели некорректное число, осталось попыток: " + (3-i));
            }
        }
        return null;
    }
}
