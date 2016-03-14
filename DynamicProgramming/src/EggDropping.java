/**
 * Created by aburagad on 2/16/2016.
 */


/*
        Find out the minimum number of attempts needed to find out from which floor the egg breaks .

 */
public class EggDropping {


    public static void main(String[] args) {
            int floors = 6 ;
            int eggs = 2 ;

            findAttempts(floors,eggs);




    }

    private static void findAttempts(int floors, int eggs) {
        int[][] T = new int[eggs+1][floors+1];
        int min = 0 ;
        for(int i=1; i <= floors; i++){
            T[1][i] = i; // initialize
        }

        for (int i = 2; i <= eggs; i++) {
            for (int j = 1; j <= floors; j++) {
                T[i][j] = Integer.MAX_VALUE;
                for (int k = 1; k <= j ; k++) {
                    int localMin =1 + Math.max( T[i-1][k-1],T[i][j-k]);
                    if(localMin < T[i][j]){
                          T[i][j] = localMin ;
                      }
                }

            }

        }
        System.out.println( T[eggs][floors]);

    }

    private static int max(int i, int j ) {
        return i>j?i:j;
    }


}
