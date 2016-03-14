import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aburagad on 2/13/2016.
 */
public class ABSYS {


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int testCases = Integer.parseInt(br.readLine());
            for (int i = 0; i < testCases; i++) {
                String emptyLine = br.readLine();
                String input = br.readLine();

                String[] bothSides = input.split("=");
                String lhs = bothSides[0];
                String rhs = bothSides[1];
                String[] ops = lhs. split("\\+");
                Integer op1=-1,op2=-1,result=-1 ;
                if( !rhs.contains("machula")){
                    result = Integer.parseInt(rhs.trim());
                }
                if( !ops[0].contains("machula") ){
                    op1= Integer.parseInt(ops[0].trim());
                }
                if(!ops[1].contains("machula")  ){
                    op2= Integer.parseInt(ops[1].trim());
                }
               if( result == -1 ){
                   Integer rs = op1 + op2 ;
                   System.out.println( lhs +" = "+ rs.toString());
               }else if( op1==-1 ){
                   Integer operator1 = result-op2;
                   System.out.println( operator1.toString() +" + "+ op2.toString()+" = "+ rhs);
               }else{
                   Integer operator2 = result-op1;
                   System.out.println( op1.toString() +" + "+ operator2.toString()+" = "+ rhs);
               }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
