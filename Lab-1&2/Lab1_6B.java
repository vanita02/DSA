import java.util.*;
/**
 * Lab1_6B
 */
public class Lab1_6B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x:");
        int x=sc.nextInt();
        System.out.println("Enter y:");
        int y=sc.nextInt();
        int ans=1;
        
        for(int i=0;i<y;i++){
            ans=x*ans;
        }
        System.out.println("Answer="+ans);
    }
}