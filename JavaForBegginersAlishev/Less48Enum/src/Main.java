import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//       Animal animal = Animal.CAT;
//        System.out.println(animal.getTranslation());
//        System.out.println(animal.toString());

//        switch(animal) {
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//            case FROG:
//                System.out.println("It's a frog");
//                break;
//        }

        Season season = Season.SUMMER;
        System.out.println(season.getTemperature());

        // Object -> Enum -> Season
        System.out.println(season instanceof Enum);
        System.out.println(season.getClass());

//        switch(season) {
//            case SUMMER:
//                System.out.println("It's warm outside");
//                break;
//            case WINTER:
//                System.out.println("It's cold outside");
//                break;
//        }
   }
}