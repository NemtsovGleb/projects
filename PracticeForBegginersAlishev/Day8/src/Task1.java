public class Task1 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        String numbers = "";

        for(int i = 0; i <= 20000; i ++ )
            numbers += i + " ";

        System.out.println(numbers);

        long after = System.currentTimeMillis();
        System.out.println("Время выполения программы в милисекундах равно " +
                (after - before));

    }
}