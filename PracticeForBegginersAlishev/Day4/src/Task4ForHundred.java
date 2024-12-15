import java.util.Arrays;
import java.util.Random;

public class Task4ForHundred {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];

        for(int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(10001);
        }

        int indexOfFirstElemntTriple = 0;
        int triple = array[0] + array[1] +array[2];
        for(int i = 1; i < 98; i++) {

            if(array[i] + array[i+1] + array[i+2] > triple) {
                triple = array[i] + array[i+1] + array[i+2];
                indexOfFirstElemntTriple = i;
            }

        }


        System.out.println(Arrays.toString(array));

        System.out.println("Наибольшая сумма трех соседних элементов " + triple);

        System.out.println("Индекс первого элемента тройки " + indexOfFirstElemntTriple);

    }
}
