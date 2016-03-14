import java.util.Scanner;

/**
 * Created by aburagad on 2/2/2016.
 */
public class Rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0 ;
        for (int i = 1; i < Math.sqrt(n) ; i++) {
            for (int j = i+1; i*j <=n && j<=n  ; j++) {
                count++;
            }
        }
        count += (int)Math.sqrt(n);
        System.out.println(count);

    }

}
