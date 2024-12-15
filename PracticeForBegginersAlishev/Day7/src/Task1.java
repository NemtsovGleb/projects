public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Russia", 2023,4000, 5000);
        Airplane airplane2 = new Airplane("Germany", 2023,3000, 5000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}