import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей:");

        int a = scanner.nextInt();

        if(a <=4 && a >= 1) {
            System.out.println("Этот дом малоэтажный");
        } else if(a <=8 && a >= 5 ) {
            System.out.println("Этот дом среднеэтажный");
        } else if (a >= 9) {
            System.out.println("Этот дом многоэтажный");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}