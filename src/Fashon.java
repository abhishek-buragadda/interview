import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aburagad on 1/30/2016.
 */
public class Fashon {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i <n  ; i++) {
                int testCase = sc.nextInt();
                int[] men = new int[testCase];
                int[] women = new int[testCase];
                for (int j = 0; j < testCase; j++) {
                       men[j]= sc.nextInt();
                }
                for (int j = 0; j < testCase; j++) {
                    women[j]= sc.nextInt();
                }
                Arrays.sort(men);
                Arrays.sort(women);
                int count = 0 ;
                for (int j = 0; j < testCase; j++) {
                    count += men[j]* women[j];
                }
                System.out.println(count);

        }
    }


}
