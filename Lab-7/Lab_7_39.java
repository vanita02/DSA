// How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
// program to solve the above problem. 
import java.util.*;
class stack{
    private char[] stackarrary;
    private int top;
    private int m;

    public stack(int m){
        this.m=m;
        stackarrary = new char[m];
        top=-1;
    }
    public void push(char c){
        stackarrary[++top] = c;
    }
    public char pop(){
        return stackarrary[top--];
    }
}
public class Lab_7_39 {
    public static boolean recognize(String str){
        int halflength = str.length()/2;
        stack s = new stack(str.length());
        for(int i=0; str.charAt(i)!='c'; i++){
            s.push(str.charAt(i));
        }
        int start=(str.length()%2==0)?halflength:halflength+1;
        for(int i=start; i<str.length(); i++){
            if(str.charAt(i)!=s.pop()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean iscorrect = recognize(str);
        System.out.println("is correct");
    }
}