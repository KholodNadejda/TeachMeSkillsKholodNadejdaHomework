package lesson1_2;
import java.util.Scanner;

/**
 * Вывести первый повторяющийся символ в строке.
 */
public class lesson1_2Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String S = in.nextLine();
        for (int i = 0; i<S.length(); i++) {
            for (int j = i+1 ; j<S.length(); ++j ) {
                if(S.charAt(i) == S.charAt(j) && S.charAt(i) != ' ') {
                    System.out.printf("Первый повторяющийся символ: %s.\n", S.charAt(i));
                    return;
                }
            }
        }
        System.out.println("Повторяющихся символов нет.");
    }
}
