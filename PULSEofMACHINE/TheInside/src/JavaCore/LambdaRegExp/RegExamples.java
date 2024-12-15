package JavaCore.LambdaRegExp;

public class RegExamples {
    public static void main(String[] args) {

        String a = "nemtsov@gmail.com";
        String b = "nemtsov@mail.ru";

        System.out.println(a.matches(".*gmail\\.com$"));

    }
}
