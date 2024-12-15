import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Toyota");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Hyundai");
        cars.add("Renault");

        cars.add(3, "Lexus");

        for(String strings : cars) {
            System.out.println(strings);
        }

        cars.remove(0);


        System.out.println(cars);
    }
}