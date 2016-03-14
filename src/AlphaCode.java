import java.util.Scanner;

/**
 * Created by aburagad on 2/8/2016.
 */

/*
    dynamic programminmg .

     Subproblem : the no of combinations that can be formed using legth i-1 .

    At each and every charecter we have two possiblities
            1. we can consider the last two digits as one charecter .(if those are less than 26)
                        In this case we will get same number of combinations as per length i-2.
            2. we can consider them seperatly as two different charecters .
                        In this case the we will the same number of combinations as of the i-1 length.
                    (No need to consider this in case zero input).



 */
public class AlphaCode {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input ;
        while( !(input = sc.nextLine()).equals("0")){
            int a[] = new int[input.length()];
            a[0]=1;
            for (int i = 1; i < a.length; i++) {
                int temp = (input.charAt(i-1)-'0')*10;
                temp+= (input.charAt(i)-'0');
                if( input.charAt(i)-'0' != 0 ){
                    a[i]=a[i-1];
                    if(temp <=26 && temp > 9){
                        a[i] += a[  i-2<0?0:i-2  ];
                     }
                }else{
                    a[i]= a[  i-2<0?0:i-2  ];
                }

            }
            System.out.println(a[input.length()-1]);
        }
    }
}
