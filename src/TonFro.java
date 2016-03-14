import java.util.Scanner;

/**
 * Created by aburagad on 1/30/2016.
 */
public class TonFro {


/*
    numberRegisters = Integer.parseInt(readInput.nextLine());
    while (!(line = readInput.nextLine()).isEmpty()) {
        System.out.println(line + "<");
}

 */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        while( (n = Integer.parseInt(sc.nextLine()))   !=  0){
            String inputString = sc.nextLine();
            int currPos = 0 ;
            boolean alternate= true ;
            String[] stringParts = null ;
            int noOfparts=0;
            if( inputString!=""){
                 noOfparts = inputString.length()/n ;
                stringParts= new String[noOfparts];
                for (int i = 0; i <noOfparts; i++,alternate=!alternate, currPos+=n) {
                    String part = inputString.substring(currPos,currPos+n);
                    if(alternate)
                        stringParts[i]= part;
                    else
                        stringParts[i] = new StringBuffer(part).reverse().toString();
                }
                convertTOChars(stringParts, n, noOfparts);
            }
            System.out.println();
        }

    }

    private static void convertTOChars(String[] stringParts, int n, int noOfparts) {
        char [][] char2DArray = new char[noOfparts][n];
        for (int i = 0; i < stringParts.length; i++) {
            char2DArray[i]= stringParts[i].toCharArray();
        }
        print(char2DArray,n,noOfparts);
    }

    private static void printStringArray( String [] a ){
        for (int  i = 0;  i < a.length ;  i++) {
            System.out.println(a[i]);
        }
    }

    private static void print(char[][] input,int n ,int  noOfParts){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < noOfParts; j++) {
                System.out.print(input[j][i]);
            }
        }


    }

}
