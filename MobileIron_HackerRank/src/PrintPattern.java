/**
 * Created by aburagad on 4/8/2016.
 */
public class PrintPattern {

    public static void main(String[] args) {
        int input = 6 ;
        int spaces = input -1 ;
        int stars = 1 ;
        for (int i = 0; i < input ; i++) {
            printSequence( spaces , stars ) ;
            spaces--;
            stars++;
        }
    }

    private static void printSequence(int spaces, int stars) {
       while( spaces != 0 ){
           System.out.print(" ");
           spaces--;
       }
       while( stars!= 0 ){
           System.out.print("#");
           stars-- ;
       }
        System.out.println();

       // String temp[] = {"1","2"};

    }
}
