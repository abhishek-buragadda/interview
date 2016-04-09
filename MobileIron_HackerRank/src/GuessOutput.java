/**
 * Created by aburagad on 4/8/2016.
 */
public final class GuessOutput {
        class Inner{
                void test(){
                    if( GuessOutput.this.flag){
                        System.out.println("HI");
                    }
                }


        }
    private boolean flag = true ;
    public GuessOutput(){
        (new Inner()).test();
    }

    public static void main(String[] args) {
        new GuessOutput();

    }


}
