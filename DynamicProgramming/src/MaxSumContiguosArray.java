/**
 * Created by aburagad on 2/18/2016.
 */

/*
        finding the subset whoese sum is maximum and also the sequence .

 */
public class MaxSumContiguosArray {


    public static void main(String[] args) {


        int []input = new int[]{-2,-3,4,-1,-2,1,5,-3};
        maxSubsetSum(input);
    }

    private static void maxSubsetSum(int[] input) {
        int max_until_i = 0 ;
        int global_max = 0 ;
        int startIndex = 0 ;
        int endIndex = input.length;

        for (int i = 0; i < input.length; i++) {
            max_until_i = max_until_i + input[i];
            if( max_until_i < 0  ){
                max_until_i = 0 ;
                startIndex = i+1  ;
            }
            if( global_max < max_until_i){
                global_max = max_until_i;
                endIndex = i ;
            }

        }
        System.out.println(global_max);
        System.out.println("start: "+startIndex+" end: "+endIndex);

        printSubset(input , startIndex , endIndex);
    }

    private static void printSubset(int[] input, int startIndex, int endIndex) {
        for (int i = startIndex; i <=endIndex; i++) {
            System.out.print(input[i]+" ");
        }
    }


}
