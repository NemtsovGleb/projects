import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjectList());
    }

    public static List<Person> parseFileToObjectList() {
        File file = new File("people.txt");
        List<Person> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] strings = line.split(" ");

                if(Integer.parseInt(strings[1]) < 0)
                    throw new IllegalArgumentException();

                int age = Integer.parseInt(strings[1]);
                Person person = new Person(strings[0], age);
                people.add(person);

            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный файл");
        }

        return null;
    }

}
