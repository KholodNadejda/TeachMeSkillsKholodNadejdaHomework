package lesson1_2;

import java.util.Scanner;

/**6) Даны 2 числа. Вывести большее из них.*/
public class lesson1_2Task6 {
    public static void main(String[] args) {
        String forCheck = enterNumber("Введите первое число:");
        if (forCheck == null) {
            return;
        }
        int frstNum = Integer.parseInt(forCheck);

        forCheck = enterNumber("Введите второе число:");
        if (forCheck == null) {
            return;
        }
        int secNum = Integer.parseInt(forCheck);

        System.out.println("Число " + Math.max(secNum, frstNum) + " большее.");
    }
    static String enterNumber(String varNum) {
        for (int i = 1; i < 4; i++) { //более удобные параметры цикла, чтобы в код читался понятнее
            System.out.println(varNum);
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
