package lesson1_2;
import java.util.Scanner;
import static java.lang.Math.abs;

/**
 * 1) В переменную записываем число. Надо вывести на экран сколько в этом
 * числе цифр и положительное оно или отрицательное. Например, "это
 * однозначное положительное число". Достаточно будет определить, является ли
 * число однозначным, "двухзначным или трехзначным и более.
 */
public class lesson1_2Task1 {
    public static void main(String[] args) {
        String forCheck = enterNumber();
        if (forCheck == null) {
            return;
        }
        int numEnter = Integer.parseInt(forCheck);
        if(numEnter < 0) {
            System.out.print("Число отрицательное,");
        } else if(numEnter > 0) {
            System.out.print("Число положительное,");
        } else {
            System.out.println("Число 0.");
            return;
        }
        if (abs(numEnter) > 9 && abs(numEnter) < 100) {
            System.out.println(" двухзначное.");
        } else if (abs(numEnter) < 10) {
            System.out.println(" однозначное.");
        } else {
            System.out.println(" трехзначное и более.");
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
