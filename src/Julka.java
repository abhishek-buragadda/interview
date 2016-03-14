import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by aburagad on 1/31/2016.
 */
public class Julka {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            BigInteger totalApples = sc.nextBigInteger();
            BigInteger difference = sc.nextBigInteger();
            BigInteger applesOne =( totalApples.subtract(difference)).divide(new BigInteger("2"));
            System.out.println(applesOne.add(difference));
            System.out.println(applesOne);
        }
    }
}
