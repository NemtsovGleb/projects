public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Russia",2023,
                200, 100);

        airplane.setYearRelease(2189);
        airplane.setLength(1000);
        airplane.fillUp(200);
        airplane.fillUp(150);
        airplane.info();
    }
}
