import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by aburagad on 2/13/2016.
 */
public class WILLITST {


    public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);
       BigInteger input = sc.nextBigInteger();

       if ( input.and(input.subtract(BigInteger.ONE)).equals(BigInteger.ZERO)){
           System.out.println("TAK");
       }else{
           System.out.println("NIE");
       }

    }
}
