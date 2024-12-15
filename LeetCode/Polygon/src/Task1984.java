public class Task1984 {

    public static void main(String[] args) {
        int[] chalk1 = {5,1,5};

        System.out.println(chalkReplacer(chalk1, 22));


    }

    public static int chalkReplacer(int[] chalk, int k) {
        int index =0;
        boolean stop = false;
        while(k > 0){

            for (int i = 0; i < chalk.length; i++) {
                if (k - chalk[i] < 0) {
                    index = i;
                    stop = true;
                    break;
                }
                k = k - chalk[i];

            }

            if(stop)
                break;

        }

        return index;
    }
}
