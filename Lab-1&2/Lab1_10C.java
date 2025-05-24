import java.util.*;
public class Lab1_10C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Days n :");
        int n=sc.nextInt();
        int y=n/365;
        int w=(n-(y*365))/7;
        int d=n-((y*365)+(w*7));

        System.out.println(y+" Years " +w+ " Weeks " +d+ " Days");
    }
}