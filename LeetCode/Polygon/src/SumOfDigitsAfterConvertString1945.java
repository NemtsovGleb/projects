public class SumOfDigitsAfterConvertString1945 {
    public static void main(String[] args) {

        char a = 'a';
        System.out.println(((int) a)- 96);
        String str = "iiii";
        String str2 = "leetcode";

 //       System.out.println(getLucky(str, 1));
        System.out.println(getLucky(str2, 2));



    }


//    char[] alphabet = {
//            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
//            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
//            'w', 'x', 'y', 'z'
//    };
//    // Альтернативный вариант представление массива символов
//    // Заполняем массив буквами алфавита
//        for (int i = 0; i < 26; i++) {
//        alphabet[i] = (char) ('a' + i);
//    }

    public static int getLucky(String s, int k) {
        char[] chars = s.toCharArray();
        int sum = 0;

            for(int i = 0; i < chars.length; i++) {
                String temp;
                char[] temp2;

                if((((int)chars[i])-96) >= 10) {
                    temp = String.valueOf((int)chars[i]-96);
                    temp2 = temp.toCharArray();
                    for(int j = 0; j < temp2.length; j++) {
                        sum += Character.getNumericValue(temp2[j]);
                    }
                    continue;
                }
                sum += ((int)chars[i]) - 96;

            }
            k--;

            while(k > 0) {
                String temp = String.valueOf(sum);
                sum = 0;
                chars = temp.toCharArray();
                for(int j = 0; j < chars.length; j++) {
                    sum += Character.getNumericValue(chars[j]);
                }

                k--;
                if(k==0)
                    return sum;
            }





        return sum;
    }
}
