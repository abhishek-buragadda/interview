import java.util.Scanner;

/**
 * Created by aburagad on 1/22/2016.
 */
public class AddingRevNumbers {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for( int i = 1 ; i <= n+1 ; i++){
             String testCase = sc.nextLine();
             if(!testCase.equals("")){
                 String[] numbers = testCase.split(" ");
                 Integer result = revNum(numbers[0])+ revNum(numbers[1]);
                System.out.println(  revNum(result.toString()));
            }
        }


    }

    private static  Integer  revNum(String number){
         String reverse = new StringBuffer(number).reverse().toString();
        return Integer.parseInt(reverse);
    }
}
