import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "Hello24823483248there254534534634hey";
        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";
        String mnodifiedString = b.replace(" ", ".");
        System.out.println(mnodifiedString);

        String с = "Hello543252435there5435235hey";
        String mnodifiedString2 = с.replaceAll("\\d+", "-");
        System.out.println(mnodifiedString2);

        String g = "Hello543252435there5435235hey";
        String modifiedString3 = g.replaceFirst("\\d+", "-");
        System.out.println(modifiedString3);


    }
}