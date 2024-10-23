import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
        System.out.println("ввод");
        Scanner sc = new Scanner(System.in);
        String slovo = sc.nextLine();
        if (slovo.equalsIgnoreCase("exit") || slovo.equalsIgnoreCase("выход")) {
            break;
        } else {
            array[i] = slovo;
        }
    }
    System.out.println("слово"+Arrays.toString(array));
}
}
