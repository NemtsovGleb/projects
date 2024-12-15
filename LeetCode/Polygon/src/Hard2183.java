public class Hard2183 {
    public static void main(String[] args) {



//        System.out.println(countPairs(numbers, 55503));

    }

//    public static long countPairs(int[] nums, int k) {
//        long count = 0;
//        long temp = 0;
//        for (int i = 0; i < nums.length-1; i++) {
//
//            for (int j = i+1; j < nums.length; j ++) {
//
//                if(((nums[i] * nums[j]) % k ) == 0) {
//                    count++;
//                }
//            }
//
//        }
//
//        return count;
//    }

    public static long countPairs(int[] nums, int k) {
        long count = 0;
        for (int i = 0; i < nums.length-1; i++) {

            for (int j = i+1; j < nums.length; j ++) {

                if(((nums[i] * nums[j]) % k ) == 0) {
                    count++;
                }
            }

        }

        return count;
    }

}
