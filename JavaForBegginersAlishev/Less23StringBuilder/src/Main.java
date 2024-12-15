import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}