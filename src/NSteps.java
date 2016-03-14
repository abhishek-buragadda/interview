import java.util.Scanner;

/**
 * Created by aburagad on 1/27/2016.
 */
public class NSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int xCoordinate = sc.nextInt();
            int yCoordinate = sc.nextInt();
            if( (xCoordinate >= yCoordinate) && ( xCoordinate - yCoordinate)<=2 ){
                if ( isEven(xCoordinate) && isEven(yCoordinate)){
                    System.out.println(xCoordinate+yCoordinate);
                }else if( !isEven(xCoordinate) && !isEven(yCoordinate)){
                    System.out.println(xCoordinate+yCoordinate-1);
                }else{
                    System.out.println("No Number");
                }
            }else{
                System.out.println("No Number");
            }

        }

    }

    private static boolean isEven( int number ){

        if( number%2 ==0 ){
            return true;
        }else{
            return false;
        }
    }

}
