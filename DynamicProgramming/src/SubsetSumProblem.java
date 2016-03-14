/**
 * Created by aburagad on 2/21/2016.
 */


/*
    Problem : given a array , find if there is a subset whose sum is equal to the input given .

 */
public class SubsetSumProblem {

    public static void main(String[] args) {


        int[] input = new int[]{2,3,7,8,10};
        int inputSum = 11 ;
        // have to find if there is an subset whose sum is 11 . In this example it is 3, 8  .

        findSubsetSum(input, inputSum) ;

    }

    private static void findSubsetSum(int[] input, int inputSum) {
        boolean [][]T = new boolean[input.length+1][inputSum+1] ;
        for (int i = 0; i <= input.length ; i++) {
            T[i][0] = true;
        }

        for (int i = 1; i <= input.length; i++) {
            for (int j = 1; j <= inputSum; j++) {
                if(  input[i-1] < j  ){
                    T[i][j] = T[i-1][j-input[i-1]]  || T[i-1][j]  ; //
                    /*
                            whether we can create a sum(s) without that number (n)  (or)
                            with that number and the difference between the expected sum and that number (s-n) .
                     */
                }else{
                    T[i][j] = T[i][j-1];
                }

            }

        }
        System.out.println(T[input.length][inputSum]);








    }


}
