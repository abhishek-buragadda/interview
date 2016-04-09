import java.util.Stack;

/**
 * Created by aburagad on 4/8/2016.
 */
public class Braces {

    public static void main(String[] args) {


        String values[] = {"{}[]()","{[)]}"};
        braces( values );

    }

    private static void braces(String[] values) {
        String[] output = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            if( checkBalance(values[i]) ){
                output[i] = "yes";
            }else{
                output[i]="no";
            }
        }
    }



    public static boolean checkBalance(String str)
    {
        if (str.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }

            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return false;
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }

        }

        return stack.isEmpty();
    }
}
