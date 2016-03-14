import java.util.Scanner;

/**
 * Created by aburagad on 2/4/2016.
 */
public class TripleFatLadies {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testcases; i++) {
                long k =  sc.nextLong();
                long result = 192+ (k-1)*250 ;
                System.out.println(result);
        }


    }
}
