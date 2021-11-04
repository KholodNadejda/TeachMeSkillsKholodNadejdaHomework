package lesson1_2;

import java.util.Scanner;

/**3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
 //Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
 //10. Вывести полученное число.
 */
public class lesson1_2Task3 {
    public static void main(String[] args) {
        String forCheck = enterNumber();
        if (forCheck == null) {
            return;
        }
        int numForTask = Integer.parseInt(forCheck);

        if (numForTask > 0) {
            System.out.printf("Результат: %d.\n", (numForTask+1));
        } else if (numForTask < 0) {
            System.out.printf("Результат: %d.\n", (numForTask-2));
        } else {
            System.out.print("Результат: 10.\n");
        }
    }
    static String enterNumber() {
        for (int i = 1; i < 4; i++) { //более удобные параметры цикла, чтобы в код читался понятнее
            System.out.println("Введите число:");
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
