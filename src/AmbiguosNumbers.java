import java.util.Scanner;

/**
 * Created by aburagad on 3/13/2016.
 */
public class AmbiguosNumbers {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noOfNumbers;
        while( (noOfNumbers=sc.nextInt())!= 0  ){
            int list[] = new int[noOfNumbers+1];
            for (int i = 0; i < noOfNumbers; i++) {
                list[i+1] = sc.nextInt();

            }
            checkAmbiguos(list);
        }
    }

    private static void checkAmbiguos(int[] list) {
        int i ,flag=-1 ;
        for ( i = 1; i < list.length ; i++) {
            if(   list[i] < list.length  &&  list[list[i]] == i  ){
                flag = -1 ;
            }else{
                flag = 0 ;
                break;
            }
        }
        if(flag == -1  ){
            System.out.println("ambiguous");
        }else{
            System.out.println("not ambiguous");

        }
    }
}
