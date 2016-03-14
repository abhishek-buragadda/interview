import java.util.Scanner;

/**
 * Created by aburagad on 1/27/2016.
 */
public class SAMER08F {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        while((n = sc.nextInt())!=0 ){
            printSquares(n);

        }
    }
    private static void printSquares(int num ){
        int count = 0 ;
        for(int i = 1 ; i <= num ; i++){
            count += i*i;
        }
        System.out.println(count);
    }
}
