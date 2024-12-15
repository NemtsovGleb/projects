import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            if(numbersString.length !=10) {
                throw new WrongQuantityNumbers();
            }
            int[] numbers = new int[numbersString.length];
            int counter = 0;

            for(String number : numbersString)
                numbers[counter++] = Integer.parseInt(number);

            int sum = 0;
            for(int number : numbers) {
                sum += number;
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (WrongQuantityNumbers e) {
            System.out.println("Некорректный входной файл");
        }
    }
}