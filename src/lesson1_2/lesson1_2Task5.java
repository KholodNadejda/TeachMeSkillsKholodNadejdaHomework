package lesson1_2;

import java.util.Scanner;

/**5) Даны 3 целых числа. Найти количество положительных и отрицательных
 чисел в исходном наборе.
 */
public class lesson1_2Task5 {
    public static void main(String[] args) {
        int posNum = 0;
        int negNum = 0;
        String forCheck;

        for (int i = 0; i<3; i++) {
            forCheck = enterNumber("Введите " + (i+1) + " число: ");
            if (forCheck == null) {
                return;
            }
            if (Integer.parseInt(forCheck) > 0) {
                posNum++;
            }
            if (Integer.parseInt(forCheck) < 0) {
                negNum++;
            }
        }
        System.out.printf("В исходном наборе положительных чисел: %d.\nВ исходном наборе отрицательных чисел: %d.\n", posNum, negNum);
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
