import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by aburagad on 2/2/2016.
 */
public class ByteLanderCoin {
    static HashMap<Integer,BigInteger> memMap = new HashMap<Integer, BigInteger>();
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input="";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while( (input=br.readLine())!=null){
                System.out.println(exhange(new BigInteger(input)).toString());
            }
        }catch(IOException e){

        }

    }

    private static BigInteger exhange(BigInteger input) {
        BigInteger max=BigInteger.ZERO;
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        BigInteger four = new BigInteger("4");
        if(input == BigInteger.ZERO )
            return BigInteger.ZERO;
        if( memMap.get(input.intValue())== null){
            max= max(input,  exhange(input.divide(two)).add(exhange(input.divide(three))).add(exhange(input.divide(four))) );
            memMap.put( input.intValue(), max);
        }else{
            max =  memMap.get(input.intValue());
        }
        return max;
    }

    private static BigInteger max( BigInteger a , BigInteger b ){

        if(a.compareTo(b) == 1  )
            return a ;
        else
              return b ;
    }
}
