public class Main {
    public static boolean satisfiesConditions(int[][] grid) {
        boolean status = true;
        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length-1; j++) {

                if(grid[i][j] == grid[i][j+1])
                    status = false;

            }
        }

        for(int i = 0; i < grid.length-1; i++)
           for(int j = 0; j < grid[i].length-1; j++)
               if(grid[i][j] == grid[i+1][j]);

        for(int i = 0; i < grid.length; i++)
            if(grid[i].length ==1)
                status = false;

        if(grid.length == 1)
            status = true;

        return status;
    }
    public static void main(String[] args) {

//        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
//        System.out.println(satisfiesConditions(twoDimArray));

        int [][] twoDimArray = {{1,0,2},{1,0,2}};
        int [][] twoDimArray2 = {{1},{2},{3}};
        int [][] twoDimArray3 = {{0}};
        System.out.println(satisfiesConditions(twoDimArray3));
    }
}