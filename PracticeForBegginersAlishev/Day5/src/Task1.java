public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setReleaseDate(2001);
        car1.setColor("Black");
        car1.setModel("Toyota");

        System.out.println(car1.getReleaseDate());
        System.out.println(car1.getColor());
        System.out.println(car1.getModel());

    }
}