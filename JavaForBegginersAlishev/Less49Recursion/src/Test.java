public class Test {
    public static void main(String[] args) {
        int i = fac(5);
        System.out.println(i);
    }

    private static int fac(int n) {
        if(n == 1)
            return 1;
        return n * fac(n-1);

    }
}