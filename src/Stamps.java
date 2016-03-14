import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aburagad on 2/25/2016.
 */
public class Stamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scenraioCount =  sc.nextInt() ;
        for (int i = 0; i < scenraioCount; i++) {
            int noOfStamps = sc.nextInt();
            int noOfFrnds = sc.nextInt();
            int stampCount[] = new int[noOfFrnds];
            for (int j = 0; j < noOfFrnds; j++) {
                stampCount[j] = sc.nextInt();
            }
            Arrays.sort(stampCount);
            int sum = 0 ;
            int count = 0 ;
            boolean isPossible = false ;
            for (int j = stampCount.length-1; j >= 0 ; j--) {
                sum =sum + stampCount[j];
                count++ ;
                if( sum >= noOfStamps){
                    isPossible= true;
                    break;
                }
            }
            System.out.println("Scenario #"+(i+1)+":");
            if(isPossible){
                System.out.println(count);
                System.out.println();
            }else {
                System.out.println("impossible");
                System.out.println();

            }
        }
    }
}
