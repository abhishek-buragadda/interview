import java.util.Scanner;
import java.util.Stack;

/**
 * Created by aburagad on 1/26/2016.
 */
public class TransformTheExprn {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n+1; i++) {
            String input = sc.nextLine();
            if(input!=""){
                Stack  stack = new Stack();
                for( int j=0 ; j < input.length() ; j ++ ){
                    char a = input.charAt(j);
                    if( Character.isAlphabetic(a)){
                        System.out.print(a);
                    }else if ( a !=')'){
                        stack.push(a);
                    }else {
                        Character b;
                        while( !stack.isEmpty()  && (b = (Character)stack.pop())!='(' ){
                            if(b!='('){
                                System.out.print(b);
                            }

                        }
                    }
                }
            }
            System.out.println();

        }
    }
}
