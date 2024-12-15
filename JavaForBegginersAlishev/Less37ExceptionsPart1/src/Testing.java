import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args){
        File file = new File("asdfa");
        try {
            Scanner scanner = new Scanner (file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println("Привет");
    }
}
