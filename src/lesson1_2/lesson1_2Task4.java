package lesson1_2;

import java.util.Scanner;

/**4) Даны 3 целых числа. Найти количество положительных чисел в исходном
 наборе.
 */
public class lesson1_2Task4 {
    public static void main(String[] args) {
        String forCheck;
        int numOfNum = 0;
        for (int i = 0; i<3; i++) {
            forCheck = enterNumber("Введите " + (i+1) + " число: ");
            if (forCheck == null) {
                return;
            }
            if (Integer.parseInt(forCheck) > 0) {
                numOfNum++;
            }
        }
        System.out.printf("В исходном наборе положительных чисел: %d.\n", numOfNum);
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
