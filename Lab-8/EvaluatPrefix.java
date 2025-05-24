
import java.util.*;

public class EvaluatPrefix {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=str.length()-1; i>=0; i--){
            char temp = str.charAt(i);
            if( Character.isDigit(temp)){
                s.push(Integer.parseInt(String.valueOf(temp)));
            } else {
                int operator1 = s.pop();
                int operator2 = s.pop();
                int value = perform_Operation(operator1, operator2, temp);
                s.push(value);
            }
        }
        int result = s.pop();
        System.out.println(result);
    }
    public static int perform_Operation(int operator1,int operator2, char operation){
        switch(operation){
            case '+' : return(operator1+operator2);
                       
            case '-' : return(operator1-operator2);
                        
            case '*' : return(operator1*operator2);
                       
            case '/' : return(operator1/operator2);
                        
            default: throw new IllegalArgumentException("Invalid operator: " + operation);
        }   
        
    }
}
