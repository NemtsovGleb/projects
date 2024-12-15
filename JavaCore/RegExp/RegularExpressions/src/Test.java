public class Test {
    public static void main(String[] args) {
        String a = "-13423";
        String b = "41235";
        String c = "+1234135";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "ffwefweAIAR231foiwwi321123456";
        System.out.println(d.matches("[a-zA-Z312]+\\d+"));

        String e = "helloa";
        System.out.println(e.matches("[^abc]+"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

        String f ="123";
        System.out.println(f.matches("\\d{2,}"));
    }
}