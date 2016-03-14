import java.util.Scanner;

/**
 * Created by aburagad on 2/4/2016.
 */
public class Hangover {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double input ;
        while( (input=sc.nextDouble())!= 0.0 ){
            double count =  0.0;
            int cardNo=0;
            if(input < 0.5){
                System.out.println("1 card(s)");
            }else{
                for ( double i = 2;  count< input  ; i++) {
                    count = count + (1/i);
                    cardNo++;
                }
                System.out.println( cardNo+" card(s)");
            }


        }

    }
}
