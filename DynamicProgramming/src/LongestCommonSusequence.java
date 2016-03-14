import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by aburagad on 2/17/2016.
 */
public class LongestCommonSusequence {
/*

how to find multiple possiblilities ? id we have mulitple substrings of same length how to figure out?


http://code.geeksforgeeks.org/7pwkQz  -- look at the source code here..doing it with Stack.

 */

    public static void main(String[] args) {


        char[]  str1 = "abcdef".toCharArray();
        char[] str2 = "acbef".toCharArray();
        lcs(str1, str2);



    }

    private static void lcs(char[] str1, char[] str2) {

        int [][]  T = new int[str1.length+1][str2.length+1];
        int max= 0 ;
        for (int i = 1; i <= str1.length; i++) {
            for (int j = 1; j <= str2.length ; j++) {
                if(  str1[i-1] == str2[j-1]  ){
                    T[i][j] = 1 + T[i-1][j-1];
                }else{
                    T[i][j] = max( T[i][j-1] , T[i-1][j] );
                }
                if( T[i][j] > max){
                    max= T[i][j];
                }

            }
        }
    //    findlcs(T,str1,str2);
        findlcsMultiple(T,str1,str2);
     //   System.out.println(max);

    }

    private static void findlcs(int[][] t,char[] str1 , char[] str2) {
        int i = str1.length;
        int j = str2.length;
        StringBuffer sb = new StringBuffer();
        while(  i> 0 && j >0 ){

            if( t[i][j] == t[i-1][j]){
                i--;
            } else if ( t[i][j] == t[i][j-1]){
                j--;
            }else{
                sb.append(str1[i-1]);
                i--;j--;

            }
        }
       System.out.println(sb.toString());
    }

    private static void findlcsMultiple(int[][] t,char[] str1 , char[] str2) {
        Set<String> stringSet = new HashSet<String>();   // create a set to avoid duplicates.
        // created a stack to push the the Seq objects if we have more than one possibility of backtracking for the actual sequence.
        Stack<Seq> stack = new Stack<Seq>();
        Seq  s = new Seq(str1.length , str2.length ,"");
        stack.push(s);
        while( !stack.isEmpty()){
            Seq element = stack.pop();
            int i = element.getRow();
            int j = element .getColumn();
            if( t[i][j]== 0 ){
                stringSet.add(element.getStr());
            }else if( t[i][j-1] == t[i-1][j] && t[i][j]== t[i][j-1] ){
                Seq newS = new Seq( i-1 , j ,element.getStr() );
                Seq newS1 = new Seq(i,j-1,element.getStr());
                stack.push(newS);
                stack.push(newS1);
            }
            else if( t[i][j] == t[i-1][j]){
                Seq newS = new Seq( i-1 , j ,element.getStr() );
                stack.push(newS);
            } else if ( t[i][j] == t[i][j-1]){
                Seq newS = new Seq( i , j -1,element.getStr() );
                stack.push(newS);
            }else{
                Seq newS = new Seq( i-1 , j-1 ,str1[i-1]+(element.getStr()) );
                stack.push(newS);
            }
        }
        for ( String str : stringSet){
            System.out.println(str);
        }

    }

    private static class Seq {
        String s ;  // this represents the sequence
        int i , j ; // these represent the current position of  to compare from the 2D matrix
        public Seq(int i ,int  j , String s){
            this .s =s ;
            this .i = i ;
            this .j =   j ;

        }
        public int getRow(){
            return i ; 
        }
        public int getColumn(){
            return j ; 
        }

        public void append(String  str ){
            s = str+s ;
        }
        public String getStr(){
            return s ;
        }

    }

    private static int max(int i, int j) {
            return i>j?i:j;
    }
}
