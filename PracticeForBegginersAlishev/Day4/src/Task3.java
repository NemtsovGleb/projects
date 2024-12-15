import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[3][5];

        Random rand = new Random();

        for(int n = 0; n < 3; n++) {
            for(int m = 0; m < 5; m++)
                array[n][m] = rand.nextInt(51);
        }

        for(int n = 0; n < 3; n++) {

            for(int m = 0; m < 5; m++) {
                System.out.print(array[n][m] + " ");
            }

            System.out.println();

        }

        int[] sumOfLines = new int[3];

        for(int n = 0; n < 3; n++) {

            int sumOfString = 0;
            for(int m = 0; m < 5; m++) {
                sumOfString += array[n][m];
            }

            sumOfLines[n] = sumOfString;

            System.out.println("Сумма " + sumOfString);

        }

        int indexOfMaxString = 0;
        int max = sumOfLines[0];
        for(int i = 1; i < 3; i++) {
            if(sumOfLines[i] > max) {
                max = sumOfLines[i];
                indexOfMaxString = i;
            }
        }
        indexOfMaxString++;

        System.out.println("Строка с наибольшей суммой " + max);

        System.out.println("Номер строки с наибольшей суммой " + indexOfMaxString);


    }
}
