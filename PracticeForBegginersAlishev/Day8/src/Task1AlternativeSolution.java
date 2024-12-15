public class Task1AlternativeSolution {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();

        StringBuilder numbers =new StringBuilder();

        for(int i = 0; i <= 20000; i ++ )
            numbers.append(i + " ");

        System.out.println(numbers);

        long after = System.currentTimeMillis();
        System.out.println("Время выполения программы в милисекундах равно " +
                (after - before));
    }
}
