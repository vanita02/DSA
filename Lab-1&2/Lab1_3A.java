import java.util.*;
public class Lab1_3A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        String y=sc.next();
        if(y=="a"||y=="e"||y=="i"||y=="o"||y=="u"||y=="A"||y=="E"||y=="I"||y=="O"||y=="U"){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Not Vowel");
        }
    }
}
