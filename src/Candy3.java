import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by aburagad on 2/2/2016.
 */
public class Candy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger sum =  BigInteger.ZERO;
        BigInteger count = BigInteger.ZERO ;
        int testcases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <testcases ; i++) {
            count = BigInteger.ZERO;
            sum = BigInteger.ZERO;
            String input = sc.nextLine();
            if (input.equals("")) {
                int children = Integer.parseInt(sc.nextLine());
                for (int j = 0; j < children; j++) {
                    String chocCount = sc.nextLine();
                    sum = sum.add(new BigInteger(chocCount));
                    count = count.add(BigInteger.ONE);
                }
                if (sum.mod(count) == BigInteger.ZERO) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        }
    }

}
