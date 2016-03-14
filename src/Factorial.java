import java.util.Scanner;

/**
 * Created by aburagad on 1/23/2016.
 */
public class Factorial {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for (int i =1; i <= n ; i++) {
            int start = sc.nextInt();
            if(start>=1 && start <= 1000000000){
                for ( int j = 5 ; j <= start ; j=j*5){
                    count += (start/j) ;
                }
                System.out.println(count);
                count = 0  ;
            }
        }
    }


}
