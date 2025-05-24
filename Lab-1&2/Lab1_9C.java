import java.util.*;
/**
 * Lab1_9C
 */
public class Lab1_9C {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in second:");
        int n=sc.nextInt();
        int h=n/3600;
        int m = (n-(h*3600))/60;
        int s= n-((h*3600)+(m*60));

        System.out.println(h+":"+m+":"+s);
    }
}