import java.util.*;
public class Lab_7_40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<Character> s = new Stack<Character>();
        // stack[]st=new stack[10];
        String in =sc.nextLine();
        int i=0;
        int counta=0;
        int countb=0;
     
        if(in.length()%2!=1){
            System.out.println("invalid");
        } else{
            while(i<in.length()){
                s.push(in.charAt(i));
                i++;
            }
        }
        while(i<in.length()/2){
            char ch = s.pop();
            if(ch != 'b'){
                break;
            } else{
                countb++;
            }
            i++; 
        }
        if(countb==in.length()/2){
        for(i=0; i<in.length()/2; i++){
            char ch = s.pop();
            if(ch != 'a'){
                break;
            } else{
                counta++;
            }
        }
        System.out.println(counta);
    }
        if(counta==countb){
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}