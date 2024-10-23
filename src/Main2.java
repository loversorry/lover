import java.util.Scanner;

public class Main2 {
    11
        int number = (int) (Math.random()*100)+ 1;
        System.out.println("угадай");
        for (int i = 1; 1 <= 3; i++){
            Scanner sc = new Scanner(System.in);
            int chislo = sc.nextInt();
            if (chislo > number) {
                System.out.println("давай по новой, у меня меньше");
            }
            else if (chislo < number){
                System.out.println("давай по новой, у меня больше");
            } else {
                System.out.println("ну наконец-то");
                break;
            }
            if (1==3) {
                System.out.println("ну зачем ты поменял" + number);
            }
        }
    }
}
