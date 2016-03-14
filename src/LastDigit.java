import java.util.Scanner;

/**
 * Created by aburagad on 1/30/2016.
 */
public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int base = sc.nextInt();
            int exponent = sc.nextInt();
            System.out.println(findLastDigit(base,exponent,10));
        }
    }
    private static int  findLastDigit( int base, int exponent , int mod){
        if( exponent == 0 )
                return 1 ;
        if ( exponent% 2 == 0 ){
            int temp  =  findLastDigit(base, exponent/2, mod);
            return (temp*temp)% mod ;
        }else{
            return  ( findLastDigit(base, exponent-1,mod)* (base%mod) )%mod;
        }
    }
}
