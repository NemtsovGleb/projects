

public class Polygon3 {

    public static boolean isSubstringPresent(String s) {
            boolean status = false;

            char [] chars = s.toCharArray();
            String reverse = "";

            for (int i = chars.length - 1; i >= 0; i--) {
                reverse = reverse + chars[i];
            }

            char [] reverseChars = reverse.toCharArray();

            for (int i = 0; i < chars.length-1; i++) {

                for(int j = 0 ; j < reverseChars.length-1 ; j++){

                    if(chars[i] == reverseChars[j] & chars[i+1] == reverseChars[j+1])
                        status = true;
                }

            }


        System.out.println(status);
     return status;
    }


    public static void main(String[] args) {

        isSubstringPresent("Hello");


    }
}
