import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");

        double x = scanner.nextDouble();

        if(x >= 5) {
            double answer = (x * x - 10) / (x + 7);
            System.out.println(answer);
        } else if ( x > -3 && x < 5) {
            double answer = (x + 3) * (x * x - 2);
            System.out.println(answer);
        } else {
            double answer = 420;
            System.out.println(answer);
        }

    }
}
