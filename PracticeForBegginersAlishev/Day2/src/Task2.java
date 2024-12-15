import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if( a >= b) {
            System.out.println("Некорректный ввод");
        } else if(a < b) {
            for(int i = a + 1; i < b; i++) {
                if((i % 5 == 0) && (i % 10 != 0)) {
                    System.out.println(i);
                }
            }
        }

    }
}
