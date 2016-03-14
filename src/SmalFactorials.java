import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by aburagad on 1/24/2016.
 */
public class SmalFactorials {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int start = sc.nextInt();
            if( start>=1 && start<=100){
                System.out.println(factorial(start));
            }
        }
    }


    private static BigInteger factorial (int num ){
        if( num < 1 ){
                return BigInteger.ONE ;
        }else{
            return factorial(num-1).multiply(BigInteger.valueOf(num));
        }

    }
}
