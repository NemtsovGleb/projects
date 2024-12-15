public class Polygon2 {

    public static char[] reverseString(char[] s) {
        String reverse = "";

        for (int i = s.length - 1; i >= 0; i--) {
            reverse = reverse + s[i];
        }

        s = reverse.toCharArray();
        return s;

    }

        public static void main (String[] args){
            char [] hello= {'h','e','l','l','o'};

            System.out.println(reverseString(hello));

        }

    }