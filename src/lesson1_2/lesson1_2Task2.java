package lesson1_2;

import java.util.Scanner;

/**
 * 2) Треугольник существует только тогда, когда сумма любых двух его сторон
 * больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
 * стороны предполагаемого треугольника. Требуется сравнить длину каждого
 * отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
 * окажется больше суммы двух других, то треугольника с такими сторонами не
 * существует
 */
public class lesson1_2Task2 {

    public static void main(String[] args) {
        String forCheck = enterNumber("Введите сторону AB треугольника АВС:");
        if (forCheck == null) {
            return;
        }
        int sideAB = Integer.parseInt(forCheck);

        forCheck = enterNumber("Введите сторону ВС треугольника АВС:");
        if (forCheck == null) {
            return;
        }
        int sideBC = Integer.parseInt(forCheck);

        forCheck = enterNumber("Введите сторону СА треугольника АВС:");
        if (forCheck == null) {
            return;
        }
        int sideCA = Integer.parseInt(forCheck);

        if (    (Math.abs(sideAB) + Math.abs(sideBC)) > Math.abs(sideCA) &&
                (Math.abs(sideAB) + Math.abs(sideCA)) > Math.abs(sideBC) &&
                (Math.abs(sideBC) + Math.abs(sideCA)) > Math.abs(sideAB)) {
            System.out.printf("Треугольник со сторонами %d, %d, %d существует.\n", sideAB, sideBC, sideCA);
        } else {
            System.out.printf("Треугольник со сторонами %d, %d, %d не существует.\n", sideAB, sideBC, sideCA);
        }
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
