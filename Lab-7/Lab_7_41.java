import java.util.*;
public class Lab_7_41 {
    Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<Character>();
        char[] c = {'{','}','(',')','[',']'};
            for(int i=0; i<c.length; i++){
                if(c[i]=='('){
                    s.push(')');
                } else if(c[i]=='{'){
                    s.push('}');
                } else if(c[i]=='['){
                    s.push(']');
                } else if(s is empty || s.pop()!=c[i]){
                    return false;
                }
            }
                System.out.println("stack is empty");
    
            public static boolean isBalance(string){
    
            }
        }
