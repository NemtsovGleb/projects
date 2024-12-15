import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        File file = new File("people.txt");
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] strings = line.split(" ");
                int number = Integer.parseInt(strings[1]);
                if(number < 0)
                    throw new IllegalArgumentException();

                people.add(line);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException е) {
            System.out.println("Недопустимое значение в файле");
        }

        return null;
    }
}
