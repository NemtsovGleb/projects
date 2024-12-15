public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        car1.setReleaseDate(1987);
        System.out.println(car1.yearDifference(1500));

        Motorbike bike1 = new Motorbike(1996, "red", "Harley");
        bike1.info();
        System.out.println(bike1.yearDifference(2020));

    }
}