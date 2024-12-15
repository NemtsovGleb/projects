public class Main {

    public static boolean isSpecialArray(int[] arg) {
        boolean Truth = true;
        for(int i = 0; i < arg.length-1; i++) {

            if((arg[i] % 2 == 0 && arg[i+1] % 2 == 0) || ((arg[i] % 2 != 0 && arg[i+1] % 2 != 0))  ) {
                Truth = false;
            }

        }
        return Truth;
    }

    public static void main(String[] args) {

        int [] numbers1 = {1,2,3,4,5};
        int [] numbers2 = {2,2,3,4};
        int [] numbers3 = {3,3,4,5};
        int [] numbers4 ={1};
        int [] numbers5 ={2};
        System.out.println(isSpecialArray(numbers1));
        System.out.println(isSpecialArray(numbers2));
        System.out.println(isSpecialArray(numbers3));
        System.out.println(isSpecialArray(numbers4));
        System.out.println(isSpecialArray(numbers5));



    }
}