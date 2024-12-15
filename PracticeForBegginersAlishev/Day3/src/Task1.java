import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            String city;
            System.out.println("Введите название города");
            city = scanner.nextLine();

            if("Stop".equals(city))
                break;


            switch (city) {
                case "Москва":
                case "Ростов":
                case "Владивосток":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Турин":
                case "Милан":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Лондон":
                case "Манчестер":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестный город");

            }


        }
    }
}