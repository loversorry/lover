import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] argc) {
        Scanner cv = new Scanner(System.in);
        System.out.println("введите время");
        int time = cv.nextInt();
        if (time > 24) {
            System.out.println("неправильное время");
        } else if (time == 23) {
            System.out.println("доброй ночи");
        } else if (time >= 18) {
            System.out.println("добрый вечер");
        } else if (time >= 12) {
            System.out.println("добрый день");
        } else if (time >= 4) {
            System.out.println("доброе утро");
        } else if (time >= 0) {
            System.out.println("доброй ночи");
        } else if (time < 0) {
            System.out.println("неправильное время");
        }

    }
}
