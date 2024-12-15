import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int arrSize = scanner.nextInt();

        int[] array = new int[arrSize];

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        int counter8 = 0;
        for(int i = 0; i < arrSize; i++) {
            if (array[i] > 8)
                counter8++;
        }

        int counter1 = 0;
        for(int i = 0; i < arrSize; i++) {
            if(array[i] == 1)
                counter1++;

        }

        int counterEven = 0;
        for(int i = 0; i < arrSize; i++) {
            if(array[i] % 2 == 0) {
                counterEven++;
            }
        }

        int counterOdd = 0;
        for(int i = 0; i < arrSize; i++) {
            if(array[i] % 2 != 0) {
                counterOdd++;
            }
        }

        int sumOfArray = 0;
        for(int i = 0; i < arrSize; i++) {
            sumOfArray += array[i];
        }

        for(int x: array)
            System.out.print(x + ", ");

        System.out.println();

        System.out.println("Информация о массиве:");

        System.out.println("Длинна массива: " + arrSize); // или array.length

        System.out.println("Количество чисел больше 8: " + counter8);

        System.out.println("Количество единиц: " + counter1);

        System.out.println("Количество четных чисел: " + counterEven);

        System.out.println("Количество нечетных чисел: " + counterOdd);

        System.out.println("Сумма всех элементов: " + sumOfArray);




    }
}
// foreach используется только для чтения массива, но не для записи в него