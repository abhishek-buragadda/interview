import java.util.Scanner;

/**
 * Created by aburagad on 1/30/2016.
 */
public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int n;
         while( (n= sc.nextInt())!= -1){
             int candyCount = 0 ;
             Integer[] packetArray = new Integer[n];
             for (int i = 0; i <n ; i++) {
                 int candies  = sc.nextInt();
                 packetArray[i]=candies;
                 candyCount+= candies;
             }
             if(candyCount%n ==0 ){
                  int cInPacket = candyCount /n  ;
                 int movesCount = 0 ;
                 for (int i = 0; i <packetArray.length ; i++) {
                    if( packetArray[i]-cInPacket > 0)
                        movesCount += packetArray[i]-cInPacket;
                 }
                 System.out.println(movesCount);

             }else{
                 System.out.println(-1);
             }
         }
    }

}
