import java.util.Scanner;

/**
 * Created by aburagad on 1/28/2016.
 */
public class WhatsNext {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3= sc.nextInt();
        while( !(n1==0 && n2==0 && n3==0) ){
            if( checkAP(n1,n2,n3)){
                System.out.println("AP "+(n3+(n3-n2)) );
            }else if ( checkGP(n1,n2,n3)){
                System.out.println("GP "+n3*(n3/n2) );
            }
             n1 = sc.nextInt();
             n2 = sc.nextInt();
             n3= sc.nextInt();
        }
    }

    private static boolean checkAP(int n1,int n2,int n3){
        if( 2*n2 == n1+ n3){
            return true;
        }else
               return false;

    }

    private static boolean checkGP(int n1,int n2,int n3){
        if( n2/n1 == n3/n2){
            return true;
        }else {
            return false;
        }

    }


}
