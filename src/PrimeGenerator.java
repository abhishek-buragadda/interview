import java.util.Scanner;

/**
 * Created by aburagad on 1/22/2016.
 */
public class PrimeGenerator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            int start = sc.nextInt();
            int end= sc.nextInt();
            if( start >0 && end > 0 && end>=start ){
                printPrimes(start, end );
            }
            System.out.println();

        }

    }

    private static void printPrimes(int start, int end ) {
        if( start>=1 && end >= start && end <= 1000000000  && end-start <= 100000 ){
            for( int i = start ; i <= end ; i ++){
                if( isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }

    private static boolean isPrime(int number ) {
        int sqroot = (int)Math.sqrt(number);
        if( number == 1 ) {
            return false ;
        }
        for( int i = 2; i <= sqroot ; i++  ){
            if(number % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
