import java.util.Arrays;
import java.util.Random;

public class Task2WithoutSort {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[100];

        for(int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(10001);

        System.out.println(Arrays.toString(array));

        int max = 0;
        for(int element : array)  {
            if(element > max)
                max = element;
        }


        int min = array[0];
        for(int element : array) {
            if(element < min)
                min = element;
        }

        int numbersLastDigitZero = 0;
        for(int x: array){
            if (x % 10 == 0) {
                numbersLastDigitZero++;
            }
        }

        int sumOfNumbersLastDigitZero = 0;
        for(int x: array) {
            if (x % 10 == 0) {
                sumOfNumbersLastDigitZero += x;
            }
        }

        System.out.println("Количество чисел оканчивающихся на 0: " + numbersLastDigitZero);

        System.out.println("Сумма элементов, оканчивающихся на 0: " + sumOfNumbersLastDigitZero);

        System.out.println("Наибольший элемент массива: " + max);

        System.out.println("Наименьший элемент массива: " + min);
    }
}

